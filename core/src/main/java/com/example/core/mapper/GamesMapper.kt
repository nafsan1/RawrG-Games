package com.example.core.mapper

import androidx.paging.PagingData
import androidx.paging.map
import com.example.core.domain.model.Games
import com.example.core.domain.model.GamesResponse
import com.example.core.local.entity.GamesEntity

fun PagingData<GamesResponse>.toGames(): PagingData<Games> {
    return map {
        Games(
            id = it.id,
            rating = it.rating,
            name = it.name,
            released = it.released,
            background_image = it.background_image,
            description = it.description,
            isFavorite = false
        )
    }
}

fun GamesEntity.toGames(): Games {
    return Games(
        id = id,
        rating = rating,
        name = name,
        released = released,
        background_image = background_image,
        description = description,
        isFavorite = isFavorite
    )
}

fun GamesResponse.toGames(): Games {
    return Games(
        id = id,
        rating = rating,
        name = name,
        released = released,
        background_image = background_image,
        description = description,
        isFavorite = false
    )
}

fun Games.toGamesEntity(): GamesEntity {
    return GamesEntity(
        id = id ?: 0,
        rating = rating,
        name = name,
        released = released ?: "",
        background_image = background_image,
        description = description,
        isFavorite = true
    )
}

