package com.nadi.nadimovies.domain.movie

import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.search.Search
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val movieGateway: MovieRepository) {
    suspend fun getNowPlayingMoviesUseCase() = movieGateway.getNowPlaying()

    //I just add this function to test it
    fun movieSortByName(movie: List<Movie.Result>) = movie.sortedBy { it.title }

    @ExperimentalCoroutinesApi
    suspend fun create(movie: List<Movie.Result>) = movieGateway.create(movie)

    @ExperimentalCoroutinesApi
    suspend fun get() = movieGateway.get()

    suspend fun search(movieName: String): Result<Search> = movieGateway.search(movieName)
}