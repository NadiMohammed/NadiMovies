package com.nadi.nadimovies.domain.similar

import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.SimilarRepository
import com.nadi.nadimovies.domain.movie.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
suspend fun movieGetSimilar(movieID: Int, similarRepository: SimilarRepository = SimilarRepository): Result<Movie> = similarRepository.getSimilar(movieID)
