package com.nadi.nadimovies.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.movie.MovieUseCase
import com.nadi.nadimovies.util.ApiStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
@ExperimentalCoroutinesApi
class HomeViewModel @Inject constructor(private val movieUseCase: MovieUseCase) : ViewModel() {

    private val _status = MutableStateFlow(ApiStatus.DONE)
    val status: StateFlow<ApiStatus>
        get() = _status

    private val _property = MutableStateFlow(Movie())
    val property: StateFlow<Movie>
        get() = _property

    private val _offlineMovies = MutableStateFlow<List<Movie.Result>>(emptyList())
    val offlineMovies: StateFlow<List<Movie.Result>>
        get() = _offlineMovies

    private val _onMessageError = MutableStateFlow<Any>("")
    val onMessageError: StateFlow<Any>
        get() = _onMessageError

    init {
        getMoviesFromDB()
        getNowPlayingMoviesList()
    }

    private fun getNowPlayingMoviesList() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING

            when (val result = movieUseCase.getNowPlayingMoviesUseCase()) {
                is Result.Success -> {
//                    _property.emit(result.results!!)
                    _property.value = result.results!!
                    saveMoviesInDB(result.results!!.results)
                    _status.value = ApiStatus.DONE
                }
                is Result.Failed -> {
                    _onMessageError.value = result.exception!!
                    _status.value = ApiStatus.DONE
                }
            }
        }
    }

    private fun saveMoviesInDB(movie: List<Movie.Result>) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            movieUseCase.create(movie)
            _status.value = ApiStatus.DONE
        }
    }


    private fun getMoviesFromDB() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            _offlineMovies.emit(movieUseCase.get())
            _status.value = ApiStatus.DONE
        }
    }


}


