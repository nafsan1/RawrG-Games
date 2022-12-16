package com.example.core.domain.model

import com.squareup.moshi.Json

data class MoviesList(
    @field:Json(name = "results")
    val movies: List<MoviesResponse>
)
