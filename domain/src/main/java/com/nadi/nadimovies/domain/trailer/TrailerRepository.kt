package com.nadi.nadimovies.domain.trailer

import com.nadi.nadimovies.domain.OperationResult
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface TrailerRepository {
    suspend fun getTrailer(movieID: Int): OperationResult<Trailer>
}