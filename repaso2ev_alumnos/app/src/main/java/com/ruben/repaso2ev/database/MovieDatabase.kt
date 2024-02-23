package com.ruben.repaso2ev.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ruben.repaso2ev.daos.MovieDao
import com.ruben.repaso2ev.entities.MovieEntity

@Database(entities = [MovieEntity::class], version = 1)
abstract class MovieDatabase: RoomDatabase() {

    abstract fun getMovies(): MovieDao
}