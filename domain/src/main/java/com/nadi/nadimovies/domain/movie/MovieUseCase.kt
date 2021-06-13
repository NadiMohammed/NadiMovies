package com.nadi.nadimovies.domain.movie

import com.nadi.nadimovies.domain.MovieRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
suspend fun getNowPlayingMoviesUseCase(movieGateway: MovieRepository = MovieRepository) =
    movieGateway.getNowPlaying()

fun movieSortByName(movie: List<Movie.Result>) = movie.sortedBy { it.title }

@ExperimentalCoroutinesApi
suspend fun create(movie: List<Movie.Result>, movieGateway: MovieRepository = MovieRepository) =
    movieGateway.create(movie)

@ExperimentalCoroutinesApi
suspend fun get(movieGateway: MovieRepository = MovieRepository) = movieGateway.get()
