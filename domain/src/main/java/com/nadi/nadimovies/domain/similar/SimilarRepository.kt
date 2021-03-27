package com.nadi.nadimovies.domain.similar

import com.nadi.nadimovies.domain.OperationResult
import com.nadi.nadimovies.domain.movie.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface SimilarRepository {
    suspend fun getSimilar(movieID: Int): OperationResult<Movie>
}