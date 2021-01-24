package com.nadi.data.gateway

import com.nadi.core.OperationResult
import com.nadi.core.trailer.Trailer
import com.nadi.core.trailer.TrailerGateway
import com.nadi.data.CallbackHandler
import com.nadi.data.network.MovieAPIs
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

//@ExperimentalCoroutinesApi
//class TrailerGatewayImplementer(private val movieAPIs: MovieAPIs = RetrofitClient().create(MovieAPIs::class.java)) :
//    TrailerGateway, CallbackHandler() {
//    override suspend fun getTrailer(movieID: Int): OperationResult<Trailer> {
//        return safeApiCall { movieAPIs.getTrailers((movieID)) }
//    }

//@ExperimentalCoroutinesApi
//class TrailerGatewayImplementer @Inject constructor(private val movieAPIs: MovieAPIs) : TrailerGateway, CallbackHandler() {
//    override suspend fun getTrailer(movieID: Int): OperationResult<Trailer> {
//        return safeApiCall { movieAPIs.getTrailers((movieID)) }
//    }
//}

@ExperimentalCoroutinesApi
class TrailerGatewayImplementer @Inject constructor(
    private val movieAPIs: MovieAPIs
) : TrailerGateway, CallbackHandler() {
    override suspend fun getTrailer(movieID: Int): OperationResult<Trailer> {
        return safeApiCall { movieAPIs.getTrailers(movieID) }

    }


}