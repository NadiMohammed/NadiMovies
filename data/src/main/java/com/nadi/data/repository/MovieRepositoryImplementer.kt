package com.nadi.data.repository

import com.nadi.data.CallbackHandler
import com.nadi.data.RetrofitBuilder
import com.nadi.data.local.MainDatabase
import com.nadi.data.local.MainDatabase.Companion.getInstance
import com.nadi.data.local.asDatabaseModel
import com.nadi.data.local.asDomainModel
import com.nadi.data.network.MovieAPIs
import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.movie.MovieRepository
import com.nadi.nadimovies.domain.search.Search
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class MovieRepositoryImplementer(
    private val database: MainDatabase = getInstance(),
    private val movieAPIs: MovieAPIs = RetrofitBuilder().create(MovieAPIs::class.java)
) : MovieRepository, CallbackHandler() {
    override suspend fun getNowPlaying(): Result<Movie> {
        return safeApiCall { movieAPIs.getNowPlayingMovies() }
    }

    override suspend fun create(movie: List<Movie.Result>) {
        database.moviesDAO.insert(movie.asDatabaseModel())
    }

    override suspend fun get(): List<Movie.Result> = database.moviesDAO.get().asDomainModel()

    override suspend fun search(movieName: String): Result<Search> {
        return safeApiCall { movieAPIs.search(movieName) }
    }

}


