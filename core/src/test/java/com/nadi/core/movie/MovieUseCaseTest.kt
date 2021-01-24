package com.nadi.core.movie

import com.nadi.core.OperationResult
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InOrder
import org.mockito.Mockito

internal class MovieUseCaseTest {

    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetNowPlaying() then invoke getNowPlaying() from MovieGateway`() = runBlockingTest {
        try {

            var invoked = false

            //Arrange
            val movieGateway = object : MovieGateway {
                override suspend fun getNowPlaying(): OperationResult<Movie> {
                    invoked = true
                    return OperationResult.Success(Movie())
                }
            }

            //Act
            MovieUseCase(movieGateway).movieGetNowPlaying()

            //Assert
            assert(invoked)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetNowPlaying() with successful getNowPlaying() from MovieGateway then return movies`() =
        try {
            runBlockingTest {

                //Arrange
                val movieGateway = object : MovieGateway {
                    override suspend fun getNowPlaying(): OperationResult<Movie> {
                        return OperationResult.Success(Movie())
                    }
                }

                //Act
                val result = MovieUseCase(movieGateway).movieGetNowPlaying()

                //Assert
                val expected = OperationResult.Success(Movie())

                assertEquals(expected, result)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }


    @ExperimentalCoroutinesApi
    @Test
    fun `movieSortByName() with list of movies then return list of movies sorted by name`() =
        try {
            runBlockingTest {

                //Arrange
                val movie = listOf(
                    Movie.Result(title = "c"),
                    Movie.Result(title = "a"),
                    Movie.Result(title = "b")
                )

                //Act
                val actual = movieSortByName(movie)

                //Assert
                val expected = listOf(
                    Movie.Result(title = "a"),
                    Movie.Result(title = "b"),
                    Movie.Result(title = "c")
                )

                assertEquals(expected, actual)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }


    @ExperimentalCoroutinesApi
    @Test
    fun `movieSortByName() with list of movies then return list of movies sorted by name Useing Mockito`() =
        try {
            runBlockingTest {

                //Arrange
                val movie = listOf(
                    Movie.Result(title = "c"),
                    Movie.Result(title = "a"),
                    Movie.Result(title = "b")
                )

                //Act
                val actual = movieSortByName(movie)

                //Assert
                val expected = listOf(
                    Movie.Result(title = "a"),
                    Movie.Result(title = "b"),
                    Movie.Result(title = "c")
                )

                assertEquals(expected, actual)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetNowPlaying() with Mockito With successful getNowPlaying() from MovieGateway then return movies`() =
        try {
            runBlockingTest {

                val movieGateway = Mockito.mock(MovieGateway::class.java)

                val inOrder: InOrder = Mockito.inOrder(movieGateway)


                Mockito.`when`(movieGateway.getNowPlaying())
                    .thenReturn(OperationResult.Success(Movie()))

                val result = movieGateway.getNowPlaying()

                val expected = OperationResult.Success(Movie())

                // to know if it called or not or called how many time
                Mockito.verify(movieGateway, Mockito.atLeastOnce()).getNowPlaying()
                //to know did it call here or befor or after this line
                inOrder.verify(movieGateway).getNowPlaying()

                assertEquals(expected, result)

            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
}
