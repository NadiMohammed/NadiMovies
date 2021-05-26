package com.nadi.data.local

import androidx.room.*

@Dao
interface MoviesDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(databaseMovie: List<DatabaseMovie>)

    @Query("SELECT * FROM movies")
    suspend fun get(): List<DatabaseMovie>

    @Update
    suspend fun update(databaseMovie: DatabaseMovie)

    @Delete
    suspend fun delete(databaseMovie: DatabaseMovie)

    @Query("DELETE FROM movies")
    suspend fun clear()
}