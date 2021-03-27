package com.nadi.data.repository

import com.nadi.data.CallbackHandler
import com.nadi.data.RetrofitBuilder
import com.nadi.data.network.MovieAPIs
import com.nadi.nadimovies.domain.OperationResult
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.movie.MovieRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi


//class MovieRepositoryImplementer(private val movieAPIs: MovieAPIs = RetrofitBuilder().create(MovieAPIs::class.java)) :
//    MovieRepository, CallbackHandler() {
//
//    override suspend fun getNowPlaying(): OperationResult<Movie> {
//        return safeApiCall { movieAPIs.getNowPlayingMovies() }
//    }
//
//}

@ExperimentalCoroutinesApi
//class MovieRepositoryImplementer @Inject constructor(private val movieAPIs: MovieAPIs) : MovieRepository, CallbackHandler() {
//class MovieRepositoryImplementer @Inject constructor(private val movieAPIs: MovieAPIs) : MovieGateway,
class MovieRepositoryImplementer(
    private val movieAPIs: MovieAPIs = RetrofitBuilder().create(
        MovieAPIs::class.java
    )
) : MovieRepository, CallbackHandler() {

    override suspend fun getNowPlaying(): OperationResult<Movie> {
        return safeApiCall { movieAPIs.getNowPlayingMovies() }
    }

}


