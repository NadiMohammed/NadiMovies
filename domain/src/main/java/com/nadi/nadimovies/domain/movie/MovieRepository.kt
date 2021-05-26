package com.nadi.nadimovies.domain.movie

import com.nadi.nadimovies.domain.Result
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface MovieRepository {
    suspend fun getNowPlaying(): Result<Movie>

    suspend fun create(movie: List<Movie.Result>)

    suspend fun get(): List<Movie.Result>
}
