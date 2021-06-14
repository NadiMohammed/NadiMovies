package com.nadi.nadimovies.domain.movie

import com.nadi.nadimovies.domain.MovieRepository
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.SimilarRepository
import com.nadi.nadimovies.domain.search.Search
import com.nadi.nadimovies.domain.similar.SimilarRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
suspend fun getNowPlayingMoviesUseCase(movieGateway: MovieRepository = MovieRepository) =
    movieGateway.getNowPlaying()

//I just add this function to test it
fun movieSortByName(movie: List<Movie.Result>) = movie.sortedBy { it.title }

@ExperimentalCoroutinesApi
suspend fun create(movie: List<Movie.Result>, movieGateway: MovieRepository = MovieRepository) =
    movieGateway.create(movie)

@ExperimentalCoroutinesApi
suspend fun get(movieGateway: MovieRepository = MovieRepository) = movieGateway.get()

@ExperimentalCoroutinesApi
suspend fun search(movieName: String, movieGateway: MovieRepository = MovieRepository): Result<Search> = movieGateway.search(movieName)