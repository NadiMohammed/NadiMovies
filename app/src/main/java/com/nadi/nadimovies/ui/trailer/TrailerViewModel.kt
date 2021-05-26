package com.nadi.nadimovies.ui.trailer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.trailer.Trailer
import com.nadi.nadimovies.domain.trailer.movieGetNowPlaying
import com.nadi.nadimovies.util.ApiStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class TrailerViewModel : ViewModel() {
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
            when (val result = movieGetNowPlaying(movieID)) {
                is Result.Success -> {
                    _property.value = result.results!!
                    _status.value = ApiStatus.DONE
                }
                is Result.Failed -> {
                    _onMessageError.postValue(result.exception!!)
                    _status.value = ApiStatus.DONE
                }
            }
        }
    }

}