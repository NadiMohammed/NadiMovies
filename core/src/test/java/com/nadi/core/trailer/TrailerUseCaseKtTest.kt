package com.nadi.core.trailer

import com.nadi.core.OperationResult
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito

internal class TrailerUseCaseKtTest {
    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetTrailer() then invoke getTrailer() from MovieGateway`() = runBlockingTest {
        try {
            var invoked = false

            //Arrange
            val trailerGateway = object : TrailerGateway {
                override suspend fun getTrailer(movieID: Int): OperationResult<Trailer> {
                    invoked = true
                    return OperationResult.Success(Trailer())
                }

            }

            //Act
            TrailerUseCase(0, trailerGateway).movieGetNowPlaying()

            //Assert
            assert(invoked)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetTrailer() with Mockito then invoke getTrailer() from MovieGateway`() =
        runBlockingTest {
            try {
                val movieGateway = Mockito.mock(TrailerGateway::class.java)

                Mockito.`when`(movieGateway.getTrailer(0))
                    .thenReturn(OperationResult.Success(Trailer()))

                val result = movieGateway.getTrailer(0)

                val expected = OperationResult.Success(Trailer())

                Assertions.assertEquals(expected, result)

            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

}