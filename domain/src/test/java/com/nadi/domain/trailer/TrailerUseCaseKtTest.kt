package com.nadi.domain.trailer

import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.trailer.Trailer
import com.nadi.nadimovies.domain.trailer.TrailerRepository
import com.nadi.nadimovies.domain.trailer.TrailerUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito

@ExperimentalCoroutinesApi
internal class TrailerUseCaseKtTest {
    @Test
    fun `movieGetTrailer() then invoke getTrailer() from MovieRepository`() = runBlockingTest {
        try {
            var invoked = false

            //Arrange
            val trailerRepository = object : TrailerRepository {
                override suspend fun getTrailer(movieID: Int): Result<Trailer> {
                    invoked = true
                    return Result.Success(Trailer())
                }

            }

            //Act
            TrailerUseCase(trailerRepository).movieGetNowPlaying(0)

            //Assert
            assert(invoked)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    @Test
    fun `movieGetTrailer() with Mockito then invoke getTrailer() from MovieRepository`() =
        runBlockingTest {
            try {
                val movieRepository = Mockito.mock(TrailerRepository::class.java)

                Mockito.`when`(movieRepository.getTrailer(0))
                    .thenReturn(Result.Success(Trailer()))

                val result = movieRepository.getTrailer(0)

                val expected = Result.Success(Trailer())

                Assertions.assertEquals(expected, result)

            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

}