package com.example.core.local

import androidx.room.*
import com.example.core.local.entity.GamesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGames(gamesEntity: GamesEntity)

    @Delete
    suspend fun deleteGames(gamesEntity: GamesEntity)

    @Query("SELECT * FROM games")
    fun getFavorite(): Flow<List<GamesEntity>>
}