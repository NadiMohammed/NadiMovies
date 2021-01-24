package com.nadi.nadimovies.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.core.OperationResult
import com.nadi.core.movie.Movie
import com.nadi.core.movie.MovieUseCase
import com.nadi.nadimovies.util.ApiStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

//class HomeViewModel : ViewModel() {
@ExperimentalCoroutinesApi
class HomeViewModel
//@ViewModelInject constructor(private val movieAPIs: MovieAPIs) : ViewModel() {
@ViewModelInject constructor(private val movieUseCase: MovieUseCase) : ViewModel() {

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _property = MutableLiveData<Movie>()
    val property: LiveData<Movie>
        get() = _property

    private val _onMessageError = MutableLiveData<Any>()
    val onMessageError: LiveData<Any>
        get() = _onMessageError

    private val _upcoming = MutableLiveData<Movie>()
    val upcoming: LiveData<Movie>
        get() = _upcoming


    init {
        getNowPlayingMoviesList()
    }

    private fun getNowPlayingMoviesList() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING

            when (val result = movieUseCase.movieGetNowPlaying()) {
                is OperationResult.Success -> {
                    _property.value = result.data
                    _upcoming.value = result.data
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

