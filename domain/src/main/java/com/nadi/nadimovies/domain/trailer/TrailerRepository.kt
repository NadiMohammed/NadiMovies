package com.nadi.nadimovies.domain.trailer

import com.nadi.nadimovies.domain.Result
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
interface TrailerRepository {
    suspend fun getTrailer(movieID: Int): Result<Trailer>
}