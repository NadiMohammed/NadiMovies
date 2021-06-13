package com.nadi.nadimovies.ui.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.movie.get
import com.nadi.nadimovies.domain.similar.movieGetSimilar
import com.nadi.nadimovies.util.ApiStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class DetailsViewModel(val movie: Movie.Result) : ViewModel() {

    private val _status = MutableStateFlow(ApiStatus.DONE)
    val status: StateFlow<ApiStatus>
        get() = _status

    private val _onMessageError = MutableStateFlow<Any>("")
    val onMessageError: StateFlow<Any>
        get() = _onMessageError

    private val _offlineMovies = MutableStateFlow<List<Movie.Result>>(emptyList())
    val offlineMovies: StateFlow<List<Movie.Result>>
        get() = _offlineMovies

    private val _property = MutableStateFlow(Movie())
    val property: StateFlow<Movie>
        get() = _property

    init {
        getMoviesFromDB()
        getSimilarMoviesList(movie.id!!)
    }

    private fun getSimilarMoviesList(movieID: Int) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            when (val result = movieGetSimilar((movieID))) {
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

    private fun getMoviesFromDB() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            _offlineMovies.value = get()
            _status.value = ApiStatus.DONE
        }
    }

}