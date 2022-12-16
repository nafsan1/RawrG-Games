package com.example.core.network.service

import com.example.core.domain.model.MoviesList
import com.example.core.util.key
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("movie/{category}")
    suspend fun getMovie(
        @Path("category") category: String = "popular",
        @Query("with_genres") withGenres: String = "",
        @Query("api_key") api_key: String = key,
        @Query("page") page: Int
    ): MoviesList

}