package com.nadi.domain.movie

import com.nadi.nadimovies.domain.Result
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.domain.movie.MovieRepository
import com.nadi.nadimovies.domain.movie.MovieUseCase
import com.nadi.nadimovies.domain.search.Search
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InOrder
import org.mockito.Mockito

@ExperimentalCoroutinesApi
internal class MovieUseCaseTest {

    /*
    Testing Without Mockito
     */
    @Test
    fun `movieGetNowPlaying() then invoke getNowPlaying() from MovieRepository`() =
        runBlockingTest {
            try {

                var invoked = false

                //Arrange
                val movieRepository = object : MovieRepository {
                    override suspend fun getNowPlaying(): Result<Movie> {
                        invoked = true
                        return Result.Success(Movie())
                    }

                    override suspend fun create(movie: List<Movie.Result>) {
                        TODO("Not yet implemented")
                    }

                    override suspend fun get(): List<Movie.Result> {
                        TODO("Not yet implemented")
                    }

                    override suspend fun search(movieName: String): Result<Search> {
                        TODO("Not yet implemented")
                    }
                }

                //Act
                MovieUseCase(movieRepository).getNowPlayingMoviesUseCase()
//                getNowPlayingMoviesUseCase(movieRepository)

                //Assert
                assert(invoked)

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    @Test
    fun `movieGetNowPlaying() with successful getNowPlaying() from MovieRepository then return movies`() =
        try {
            runBlockingTest {

                //Arrange
                val movieRepository = object : MovieRepository {
                    override suspend fun getNowPlaying(): Result<Movie> {
                        return Result.Success(Movie())
                    }

                    override suspend fun create(movie: List<Movie.Result>) {
                        TODO("Not yet implemented")
                    }

                    override suspend fun get(): List<Movie.Result> {
                        TODO("Not yet implemented")
                    }

                    override suspend fun search(movieName: String): Result<Search> {
                        TODO("Not yet implemented")
                    }
                }

                //Act
//                val result = getNowPlayingMoviesUseCase(movieRepository)
                val result = MovieUseCase(movieRepository).getNowPlayingMoviesUseCase()

                //Assert
                val expected = Result.Success(Movie())

                assertEquals(expected, result)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }


    @Test
    fun `movieSortByName() with list of movies then return list of movies sorted by name`() =
        try {
            runBlockingTest {

                val movieRepository = object : MovieRepository {
                    override suspend fun getNowPlaying(): Result<Movie> {
                        TODO("Not yet implemented")
                    }

                    override suspend fun create(movie: List<Movie.Result>) {
                        TODO("Not yet implemented")
                    }

                    override suspend fun get(): List<Movie.Result> {
                        TODO("Not yet implemented")
                    }

                    override suspend fun search(movieName: String): Result<Search> {
                        TODO("Not yet implemented")
                    }
                }

                //Arrange
                val movie = listOf(
                    Movie.Result(title = "c"),
                    Movie.Result(title = "a"),
                    Movie.Result(title = "b")
                )

                //Act
//                val actual = movieSortByName(movie)
                val actual = MovieUseCase(movieRepository).movieSortByName(movie)

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


    @Test
    fun `search() with successful from MovieRepository then return moviesList`() =
        try {
            runBlockingTest {
                //Arrange
                val movieRepository = object : MovieRepository {
                    override suspend fun getNowPlaying(): Result<Movie> {
                        TODO("Not yet implemented")
                    }

                    override suspend fun create(movie: List<Movie.Result>) {
                        TODO("Not yet implemented")
                    }

                    override suspend fun get(): List<Movie.Result> {
                        TODO("Not yet implemented")
                    }

                    override suspend fun search(movieName: String): Result<Search> {
                        return Result.Success(Search())
                    }
                }

                //Act
//                val result = search("batman", movieRepository)
                val result = MovieUseCase(movieRepository).search("batman")

                //Assert
                val expected = Result.Success(Search())

                assertEquals(expected, result)

            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
//    /*
//    Testing With Mockito
//     */


    @Test
    fun `movieSortByName() with list of movies then return list of movies sorted by name Using Mockito`() =
        try {
            runBlockingTest {

                val movieRepository = Mockito.mock(MovieRepository::class.java)

                //Arrange
                val movie = listOf(
                    Movie.Result(title = "c"),
                    Movie.Result(title = "a"),
                    Movie.Result(title = "b")
                )

                //Act
                val actual = MovieUseCase(movieRepository).movieSortByName(movie)

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

    @Test
    fun `movieGetNowPlaying() with successful getNowPlaying() from MovieRepository then return movies Using Mockito`() =
        try {
            runBlockingTest {

                val movieRepository = Mockito.mock(MovieRepository::class.java)

                val inOrder: InOrder = Mockito.inOrder(movieRepository)

                Mockito.`when`(movieRepository.getNowPlaying())
                    .thenReturn(Result.Success(Movie()))

                val result = movieRepository.getNowPlaying()

                val expected = Result.Success(Movie())

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
