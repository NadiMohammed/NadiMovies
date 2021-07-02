package com.nadi.data.repository

import com.nadi.data.CallbackHandler
import com.nadi.data.network.MovieAPIs
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.trailer.Trailer
import com.nadi.nadimovies.domain.trailer.TrailerRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class TrailerRepositoryImplementer @Inject constructor(private val movieAPIs: MovieAPIs) :
    TrailerRepository, CallbackHandler() {
    override suspend fun getTrailer(movieID: Int): Result<Trailer> {
        return safeApiCall { movieAPIs.getTrailers(movieID) }
    }
}