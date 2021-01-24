package com.nadi.nadimovies.ui.trailer

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.core.OperationResult
import com.nadi.core.trailer.Trailer
import com.nadi.core.trailer.TrailerUseCase
import com.nadi.nadimovies.util.ApiStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class TrailerViewModel @ViewModelInject constructor(private val trailerUseCase: TrailerUseCase) :
    ViewModel() {
    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _onMessageError = MutableLiveData<Any>()
    val onMessageError: LiveData<Any>
        get() = _onMessageError

    private val _property = MutableLiveData<Trailer>()
    val property: LiveData<Trailer>
        get() = _property


    fun getMovieTrailer(movieID: Int) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            when (val result = trailerUseCase.movieGetNowPlaying(movieID)) {
                is OperationResult.Success -> {
                    _property.value = result.data
                    _status.value = ApiStatus.DONE
                }
                is OperationResult.Error -> {
                    _onMessageError.postValue(result.exception)
                    _status.value = ApiStatus.DONE
                }
            }
        }
    }

}