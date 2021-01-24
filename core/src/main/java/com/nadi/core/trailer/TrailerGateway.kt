package com.nadi.core.trailer

import com.nadi.core.OperationResult
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface TrailerGateway {
    suspend fun getTrailer(movieID: Int): OperationResult<Trailer>
}