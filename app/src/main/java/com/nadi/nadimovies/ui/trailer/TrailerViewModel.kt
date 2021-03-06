package com.nadi.nadimovies.ui.trailer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.trailer.Trailer
import com.nadi.nadimovies.domain.trailer.TrailerUseCase
import com.nadi.nadimovies.util.ApiStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@HiltViewModel
class TrailerViewModel @Inject constructor(private val trailerUseCase: TrailerUseCase) :
    ViewModel() {
    private val _status = MutableStateFlow(ApiStatus.DONE)
    val status: StateFlow<ApiStatus>
        get() = _status

    private val _onMessageError = MutableStateFlow<Any>("")
    val onMessageError: StateFlow<Any>
        get() = _onMessageError

    private val _property = MutableStateFlow(Trailer())
    val property: StateFlow<Trailer>
        get() = _property


    fun getMovieTrailer(movieID: Int) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            when (val result = trailerUseCase.movieGetNowPlaying(movieID)) {
                is Result.Success -> {
                    _property.value = result.results!!
                    _status.value = ApiStatus.DONE
                }
                is Result.Failed -> {
                    _onMessageError.value = result.exception!!
                    _status.value = ApiStatus.DONE
                }
            }
        }
    }

}