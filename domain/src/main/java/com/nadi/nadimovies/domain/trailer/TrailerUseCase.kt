package com.nadi.nadimovies.domain.trailer

import com.nadi.nadimovies.domain.Result
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject


@ExperimentalCoroutinesApi
//suspend fun movieGetNowPlaying(movieID: Int, trailerRepository: TrailerRepository = TrailerRepository): Result<Trailer> = trailerRepository.getTrailer(movieID)
class TrailerUseCase @Inject constructor(private val trailerRepository: TrailerRepository) {
    suspend fun movieGetNowPlaying(movieID: Int): Result<Trailer> =
        trailerRepository.getTrailer(movieID)
}
//suspend fun getSimilarMoviesUseCase(movieID: Int, movieRepository: MovieRepository = MovieRepository): Result<List<Movie>> = movieRepository.getSimilar(movieID)
