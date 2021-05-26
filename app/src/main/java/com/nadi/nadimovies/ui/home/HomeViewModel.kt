package com.nadi.nadimovies.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.movie.create
import com.nadi.nadimovies.domain.movie.get
import com.nadi.nadimovies.domain.movie.getNowPlayingMoviesUseCase
import com.nadi.nadimovies.util.ApiStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class HomeViewModel : ViewModel() {

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _property = MutableLiveData<Movie>()
    val property: LiveData<Movie>
        get() = _property

    private val _offlineMovies = MutableLiveData<List<Movie.Result>>()
    val offlineMovies: LiveData<List<Movie.Result>>
        get() = _offlineMovies

    private val _onMessageError = MutableLiveData<Any>()
    val onMessageError: LiveData<Any>
        get() = _onMessageError

    init {
        getMoviesFromDB()
        getNowPlayingMoviesList()
    }

    private fun getNowPlayingMoviesList() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING

            when (val result = getNowPlayingMoviesUseCase()) {
                is Result.Success -> {
                    _property.value = result.results!!
                    saveMoviesInDB(result.results!!.results)
                    _status.value = ApiStatus.DONE
                }
                is Result.Failed -> {
                    _onMessageError.postValue(result.exception!!)
                    _status.value = ApiStatus.DONE
                }
            }
        }
    }

    private fun saveMoviesInDB(movie: List<Movie.Result>) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            create(movie)
            _status.value = ApiStatus.DONE
        }
    }

    private fun getMoviesFromDB() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            _offlineMovies.value = get()!!
            _status.value = ApiStatus.DONE
        }
    }


}


