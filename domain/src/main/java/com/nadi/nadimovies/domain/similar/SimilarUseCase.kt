package com.nadi.nadimovies.domain.similar

import com.nadi.nadimovies.domain.OperationResult
import com.nadi.nadimovies.domain.SimilarRepository
import com.nadi.nadimovies.domain.movie.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
suspend fun movieGetSimilar(
    movieID: Int,
    similarRepository: SimilarRepository = SimilarRepository
): OperationResult<Movie> = similarRepository.getSimilar(movieID)
