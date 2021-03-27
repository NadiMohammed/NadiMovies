package com.nadi.nadimovies.ui.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nadi.nadimovies.domain.movie.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi

class MovieDetailsViewModelFactory(private val movie: Movie.Result) :
    ViewModelProvider.NewInstanceFactory() {

    @ExperimentalCoroutinesApi
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DetailsViewModel(movie) as T
    }
}