package com.example.core.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core.local.entity.GamesEntity

@Database(
    entities = [GamesEntity::class],
    version = 1,
    exportSchema = false
)
abstract class GamesDatabase : RoomDatabase() {
    abstract val dao: GamesDao
}