package com.nadi.core.movie

import com.nadi.core.OperationResult
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface MovieGateway {
    suspend fun getNowPlaying(): OperationResult<Movie>
}
