package com.nadi.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nadi.nadimovies.domain.movie.Movie

@Entity(tableName = "movies")
data class DatabaseMovie(
//    @PrimaryKey(autoGenerate = true)
//    var id: Long = 0,

    @PrimaryKey
    var title: String = "",
    var posterPath: String = "",
    var voteAverage: Double? = 0.0,
)

//Insert
fun List<Movie.Result>.asDatabaseModel(): List<DatabaseMovie> =
    map {
        DatabaseMovie(
//            id = 0,
            title = it.title!!,
            posterPath = it.poster_path!!,
            voteAverage = it.vote_average
        )
    }

//Get
fun List<DatabaseMovie>.asDomainModel(): List<Movie.Result> =
    map {
        Movie.Result(
//            id = 0,
            title = it.title,
            poster_path = it.posterPath,
            vote_average = it.voteAverage
        )
    }