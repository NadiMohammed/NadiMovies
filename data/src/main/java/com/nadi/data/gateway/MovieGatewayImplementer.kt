package com.nadi.data.gateway

import com.nadi.core.OperationResult
import com.nadi.core.movie.Movie
import com.nadi.core.movie.MovieGateway
import com.nadi.data.CallbackHandler
import com.nadi.data.network.MovieAPIs
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject


//class MovieGatewayImplementer(private val movieAPIs: MovieAPIs = RetrofitClient().create(MovieAPIs::class.java)) :
//    MovieGateway, CallbackHandler() {
//
//    override suspend fun getNowPlaying(): OperationResult<Movie> {
//        return safeApiCall { movieAPIs.getNowPlayingMovies() }
//    }
//
//}

@ExperimentalCoroutinesApi
//class MovieGatewayImplementer @Inject constructor(private val movieAPIs: MovieAPIs) : MovieGateway, CallbackHandler() {
class MovieGatewayImplementer @Inject constructor(private val movieAPIs: MovieAPIs) : MovieGateway,
    CallbackHandler() {
    override suspend fun getNowPlaying(): OperationResult<Movie> {
        return safeApiCall { movieAPIs.getNowPlayingMovies() }
    }
}


