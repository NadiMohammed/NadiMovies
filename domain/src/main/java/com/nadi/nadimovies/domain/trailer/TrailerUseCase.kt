package com.nadi.nadimovies.domain.trailer

import com.nadi.nadimovies.domain.OperationResult
import com.nadi.nadimovies.domain.TrailerRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
suspend fun movieGetNowPlaying(
    movieID: Int,
    trailerRepository: TrailerRepository = TrailerRepository
): OperationResult<Trailer> = trailerRepository.getTrailer(movieID)

//suspend fun getSimilarMoviesUseCase(movieID: Int, movieRepository: MovieRepository = MovieRepository): Result<List<Movie>> = movieRepository.getSimilar(movieID)
