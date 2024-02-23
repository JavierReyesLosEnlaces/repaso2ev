package com.ruben.repaso2ev.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ruben.repaso2ev.entities.MovieEntity

@Dao
interface MovieDao {

    @Query("SELECT * FROM movieList WHERE title like :name")
    suspend fun selectAllMovies(name: String):List<MovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllMovies(allMovies:List<MovieEntity>)

    @Query("DELETE FROM movieList")
    suspend fun deleteAllMovies()
}