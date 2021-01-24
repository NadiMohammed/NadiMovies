package com.nadi.core.trailer

import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

//suspend fun movieGetTrailer(movieID: Int,trailerGateway: TrailerGateway = CoreDependencies.TrailerGateway) = trailerGateway.getTrailer(movieID)

//suspend fun movieGetTrailer(movieID: Int, trailerGateway: TrailerGateway) =
//    trailerGateway.getTrailer(movieID)
@ExperimentalCoroutinesApi
class TrailerUseCase @Inject constructor(
    private val trailerGateway: TrailerGateway
) {
    suspend fun movieGetNowPlaying(movieID: Int) = trailerGateway.getTrailer(movieID)
}