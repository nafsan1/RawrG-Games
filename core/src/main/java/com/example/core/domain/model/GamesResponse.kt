package com.example.core.domain.model

import com.squareup.moshi.Json

data class GamesResponse(
    @field:Json(name = "id")
    val id: Int,

    @field:Json(name = "rating")
    val rating: Double,

    @field:Json(name = "name")
    val name: String,

    @field:Json(name = "released")
    var released: String? = "",

    @field:Json(name = "background_image")
    var background_image: String? = "",

    @field:Json(name = "description")
    val description: String? = ""
)