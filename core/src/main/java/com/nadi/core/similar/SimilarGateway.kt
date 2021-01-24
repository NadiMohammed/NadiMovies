package com.nadi.core.similar

import com.nadi.core.OperationResult
import com.nadi.core.movie.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface SimilarGateway {
    suspend fun getSimilar(movieID: Int): OperationResult<Movie>
}