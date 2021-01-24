package com.nadi.core.movie

import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject


//suspend fun movieGetNowPlaying(movieGateway: MovieGateway = CoreDependencies.MovieGateway) = movieGateway.getNowPlaying()
//suspend fun movieGetNowPlaying(movieGateway: MovieGateway) = movieGateway.getNowPlaying()

@ExperimentalCoroutinesApi
class MovieUseCase @Inject constructor(private val movieGateway: MovieGateway) {
    suspend fun movieGetNowPlaying() = movieGateway.getNowPlaying()
}

fun movieSortByName(movie: List<Movie.Result>) = movie.sortedBy { it.title }
