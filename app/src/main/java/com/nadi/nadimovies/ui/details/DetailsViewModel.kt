package com.nadi.nadimovies.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.nadimovies.domain.OperationResult
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.similar.movieGetSimilar
import com.nadi.nadimovies.util.ApiStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class DetailsViewModel(val movie: Movie.Result) : ViewModel() {

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _onMessageError = MutableLiveData<Any>()
    val onMessageError: LiveData<Any>
        get() = _onMessageError

    private val _property = MutableLiveData<Movie>()
    val property: LiveData<Movie>
        get() = _property

    init {
        getSimilarMoviesList(movie.id!!)
    }

    private fun getSimilarMoviesList(movieID: Int) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            when (val result = movieGetSimilar((movieID))) {
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