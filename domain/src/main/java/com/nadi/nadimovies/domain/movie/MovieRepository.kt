package com.nadi.nadimovies.domain.movie

import com.nadi.nadimovies.domain.OperationResult
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface MovieRepository {
    suspend fun getNowPlaying(): OperationResult<Movie>
//    suspend fun getNowPlaying(): Result<List<Movie>>

}
