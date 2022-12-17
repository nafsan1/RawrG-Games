package com.example.core.domain.model

import com.squareup.moshi.Json

data class GamesList(
    @field:Json(name = "results")
    val games: List<GamesResponse>
)
