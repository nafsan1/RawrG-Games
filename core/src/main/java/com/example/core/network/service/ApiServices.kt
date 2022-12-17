package com.example.core.network.service

import com.example.core.domain.model.GamesList
import com.example.core.domain.model.GamesResponse
import com.example.core.util.key
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("games")
    suspend fun getGames(
        @Query("key") api_key: String = key,
        @Query("page") page: Int,
        @Query("page_size") pageSize: Int = 10
    ): GamesList

    @GET("games")
    suspend fun getSearch(
        @Query("key") api_key: String = key,
        @Query("search") query: String ,
        @Query("page") page: Int,
        @Query("page_size") pageSize: Int = 10
    ): GamesList

    @GET("games/{id}")
    suspend fun getDetail(
        @Path("id") id: Int ,
        @Query("key") api_key: String = key
    ): GamesResponse
}