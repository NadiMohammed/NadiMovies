package com.nadi.data.repository

import com.nadi.data.CallbackHandler
import com.nadi.data.RetrofitBuilder
import com.nadi.data.network.MovieAPIs
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.trailer.Trailer
import com.nadi.nadimovies.domain.trailer.TrailerRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class TrailerRepositoryImplementer(
    private val movieAPIs: MovieAPIs = RetrofitBuilder().create(
        MovieAPIs::class.java
    )
) : TrailerRepository, CallbackHandler() {
    override suspend fun getTrailer(movieID: Int): Result<Trailer> {
        return safeApiCall { movieAPIs.getTrailers(movieID) }
    }
}