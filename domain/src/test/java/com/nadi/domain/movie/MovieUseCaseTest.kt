package com.nadi.domain.movie

import com.nadi.nadimovies.domain.OperationResult
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.movie.MovieRepository
import com.nadi.nadimovies.domain.movie.getNowPlayingMoviesUseCase
import com.nadi.nadimovies.domain.movie.movieSortByName
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InOrder
import org.mockito.Mockito

internal class MovieUseCaseTest {

    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetNowPlaying() then invoke getNowPlaying() from MovieRepository`() =
        runBlockingTest {
            try {

                var invoked = false

                //Arrange
                val movieRepository = object : MovieRepository {
                    override suspend fun getNowPlaying(): OperationResult<Movie> {
                        invoked = true
                        return OperationResult.Success(Movie())
                    }
                }

                //Act
//            MovieUseCase(movieRepository).movieGetNowPlaying()
                getNowPlayingMoviesUseCase(movieRepository)

                //Assert
                assert(invoked)

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    @ExperimentalCoroutinesApi
    @Test
    fun `movieGetNowPlaying() with successful getNowPlaying() from MovieRepository then return movies`() =
        try {
            runBlockingTest {

                //Arrange
                val movieRepository = object : MovieRepository {
                    override suspend fun getNowPlaying(): OperationResult<Movie> {
                        return OperationResult.Success(Movie())
                    }
                }

                //Act
//                val result = MovieUseCase(movieRepository).movieGetNowPlaying()
                val result = getNowPlayingMoviesUseCase(movieRepository)

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
    fun `movieGetNowPlaying() with Mockito With successful getNowPlaying() from MovieRepository then return movies`() =
        try {
            runBlockingTest {

                val movieRepository = Mockito.mock(MovieRepository::class.java)

                val inOrder: InOrder = Mockito.inOrder(movieRepository)


                Mockito.`when`(movieRepository.getNowPlaying())
                    .thenReturn(OperationResult.Success(Movie()))

                val result = movieRepository.getNowPlaying()

                val expected = OperationResult.Success(Movie())

                // to know if it called or not or called how many time
                Mockito.verify(movieRepository, Mockito.atLeastOnce()).getNowPlaying()
                //to know did it call here or befor or after this line
                inOrder.verify(movieRepository).getNowPlaying()

                assertEquals(expected, result)

            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
}
