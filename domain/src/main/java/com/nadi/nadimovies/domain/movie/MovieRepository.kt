package com.nadi.nadimovies.domain.movie

import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.search.Search

interface MovieRepository {
    suspend fun getNowPlaying(): Result<Movie>

    suspend fun create(movie: List<Movie.Result>)

    suspend fun get(): List<Movie.Result>

    suspend fun search(movieName: String): Result<Search>
}
