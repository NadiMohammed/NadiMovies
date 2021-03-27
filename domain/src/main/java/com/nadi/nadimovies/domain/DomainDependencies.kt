package com.nadi.nadimovies.domain

import com.nadi.nadimovies.domain.movie.MovieRepository
import com.nadi.nadimovies.domain.similar.SimilarRepository
import com.nadi.nadimovies.domain.trailer.TrailerRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
internal lateinit var MovieRepository: MovieRepository
    private set

@ExperimentalCoroutinesApi
internal lateinit var SimilarRepository: SimilarRepository
    private set

@ExperimentalCoroutinesApi
internal lateinit var TrailerRepository: TrailerRepository
    private set

@ExperimentalCoroutinesApi
object DomainDependencies {

    fun injectMovieRepository(movieRepository: MovieRepository) {
        MovieRepository = movieRepository
    }

    fun injectSimilarRepository(similarRepository: SimilarRepository) {
        SimilarRepository = similarRepository
    }

    fun injectTrailerRepository(trailerRepository: TrailerRepository) {
        TrailerRepository = trailerRepository
    }

}