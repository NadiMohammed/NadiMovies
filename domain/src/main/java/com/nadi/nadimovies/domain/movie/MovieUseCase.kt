package com.nadi.nadimovies.domain.movie

import com.nadi.nadimovies.domain.MovieRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
suspend fun getNowPlayingMoviesUseCase(movieGateway: MovieRepository = MovieRepository) =
    movieGateway.getNowPlaying()

fun movieSortByName(movie: List<Movie.Result>) = movie.sortedBy { it.title }
