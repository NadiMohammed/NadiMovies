package com.nadi.nadimovies.ui.details

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.nadi.core.OperationResult
import com.nadi.core.movie.Movie
import com.nadi.core.similar.SimilarUseCase
import com.nadi.nadimovies.util.ApiStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class DetailsViewModel @ViewModelInject constructor(
    private val similarUseCase: SimilarUseCase,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel(), LifecycleObserver {


    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _onMessageError = MutableLiveData<Any>()
    val onMessageError: LiveData<Any>
        get() = _onMessageError

    private val _property = MutableLiveData<Movie>()
    val property: LiveData<Movie>
        get() = _property

    private val _selectedMovie: MutableLiveData<Movie.Result> =
        savedStateHandle.getLiveData("MovieResult")
    val selectedMovie: LiveData<Movie.Result>
        get() = _selectedMovie

    init {
        getSimilarMoviesList()
    }

    private fun getSimilarMoviesList() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            when (val result = similarUseCase.movieGetSimilar(selectedMovie.value!!.id!!)) {
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