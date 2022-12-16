package com.example.core.domain.model

import com.squareup.moshi.Json

data class MoviesResponse(
    @field:Json(name = "id")
    val id: Int,

    @field:Json(name = "title")
    val title: String,

    @field:Json(name = "release_date")
    var release_date: String? = "",

    @field:Json(name = "poster_path")
    var poster_path: String? = "",

    @field:Json(name = "overview")
    val overview: String
)