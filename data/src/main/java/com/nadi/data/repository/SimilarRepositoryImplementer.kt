package com.nadi.data.repository

import com.nadi.data.CallbackHandler
import com.nadi.data.network.MovieAPIs
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.similar.SimilarRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
//class SimilarRepositoryImplementer(private val movieAPIs: MovieAPIs = RetrofitBuilder().create(MovieAPIs::class.java)
class SimilarRepositoryImplementer @Inject constructor(private val movieAPIs: MovieAPIs) :
    SimilarRepository, CallbackHandler() {
    override suspend fun getSimilar(movieID: Int): Result<Movie> {
        return safeApiCall { movieAPIs.getSimilar(movieID) }
    }
}