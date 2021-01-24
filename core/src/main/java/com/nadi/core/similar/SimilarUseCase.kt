package com.nadi.core.similar

import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

//suspend fun movieGetSimilar(movieID: Int, similarGateway: SimilarGateway) = similarGateway.getSimilar(movieID)

@ExperimentalCoroutinesApi
class SimilarUseCase @Inject constructor(
    private val similarGateway: SimilarGateway
) {
    suspend fun movieGetSimilar(movieID: Int) = similarGateway.getSimilar(movieID)
}