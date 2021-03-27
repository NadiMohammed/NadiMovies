package com.nadi.domain.trailer

import com.nadi.nadimovies.domain.OperationResult
import com.nadi.nadimovies.domain.trailer.Trailer
import com.nadi.nadimovies.domain.trailer.TrailerRepository
import com.nadi.nadimovies.domain.trailer.movieGetNowPlaying
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito


internal class TrailerUseCaseKtTest {
    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetTrailer() then invoke getTrailer() from MovieRepository`() = runBlockingTest {
        try {
            var invoked = false

            //Arrange
            val trailerRepository = object : TrailerRepository {
                override suspend fun getTrailer(movieID: Int): OperationResult<Trailer> {
                    invoked = true
                    return OperationResult.Success(Trailer())
                }

            }

            //Act
//            TrailerUseCase(0, trailerRepository).movieGetNowPlaying()
            movieGetNowPlaying(0, trailerRepository)

            //Assert
            assert(invoked)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetTrailer() with Mockito then invoke getTrailer() from MovieRepository`() =
        runBlockingTest {
            try {
                val movieRepository = Mockito.mock(TrailerRepository::class.java)

                Mockito.`when`(movieRepository.getTrailer(0))
                    .thenReturn(OperationResult.Success(Trailer()))

                val result = movieRepository.getTrailer(0)

                val expected = OperationResult.Success(Trailer())

                Assertions.assertEquals(expected, result)

            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

}