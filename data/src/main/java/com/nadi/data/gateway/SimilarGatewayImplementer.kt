package com.nadi.data.gateway

import com.nadi.core.OperationResult
import com.nadi.core.movie.Movie
import com.nadi.core.similar.SimilarGateway
import com.nadi.data.CallbackHandler
import com.nadi.data.network.MovieAPIs
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class SimilarGatewayImplementer @Inject constructor(private val movieAPIs: MovieAPIs) :
    SimilarGateway, CallbackHandler() {
    override suspend fun getSimilar(movieID: Int): OperationResult<Movie> {
        return safeApiCall { movieAPIs.getSimilar(movieID) }
    }
}