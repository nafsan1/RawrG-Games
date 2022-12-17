package com.example.core.repository

import androidx.paging.PagingData
import com.example.core.domain.model.Games
import com.example.core.domain.model.GamesResponse
import kotlinx.coroutines.flow.Flow

interface GamesRepository {
    fun getGames(
    ):Flow<PagingData<GamesResponse>>
    fun getSearch(query: String
    ):Flow<PagingData<GamesResponse>>

    suspend fun getDetail(
        id: Int,
    ): Result<Games>

    suspend fun insertGames(games: Games)
    suspend fun deletedGames(games: Games)
    fun getFavorite(): Flow<List<Games>>
}