package com.nadi.nadimovies.domain.similar

import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class SimilarUseCase @Inject constructor(private val similarRepository: SimilarRepository) {
    suspend fun movieGetSimilar(movieID: Int): Result<Movie> = similarRepository.getSimilar(movieID)
}
