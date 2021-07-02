package com.nadi.nadimovies.ui.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.MovieUseCase
import com.nadi.nadimovies.domain.search.Search
import com.nadi.nadimovies.util.ApiStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val movieUseCase: MovieUseCase) : ViewModel() {

    private val _movie = MutableStateFlow(Search())
    val movie: StateFlow<Search>
        get() = _movie

    private val _status = MutableStateFlow(ApiStatus.DONE)
    val status: StateFlow<ApiStatus>
        get() = _status

    private val _onMessageError = MutableStateFlow<Any>("")
    val onMessageError: StateFlow<Any>
        get() = _onMessageError


    @ExperimentalCoroutinesApi
    fun searchMovie(moveName: String) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            when (val result = movieUseCase.search(moveName)) {
                is Result.Success<Search> -> {
                    _movie.value = result.results!!
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