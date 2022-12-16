package com.example.core.repository

import androidx.paging.PagingData
import com.example.core.domain.model.Games
import com.example.core.domain.model.GamesResponse
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {
     fun getAllMovies(
    ):Flow<PagingData<GamesResponse>>
    fun getRecommendMovies(movieId:Int
    ):Flow<PagingData<GamesResponse>>

    suspend fun getDetail(id:Int):Result<List<Games>>

    suspend fun insertMovies(games: Games)
    suspend fun deletedMovie(games: Games)
    fun getFavorite(): Flow<List<Games>>
}