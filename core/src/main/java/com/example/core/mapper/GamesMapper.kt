package com.example.core.mapper

import androidx.paging.PagingData
import androidx.paging.map
import com.example.core.domain.model.Games
import com.example.core.domain.model.GamesResponse
import com.example.core.local.entity.GamesEntity

fun PagingData<GamesResponse>.toMovies(): PagingData<Games> {
    return map {
        Games(
            id = it.id,
            title = it.title,
            release_date = it.release_date,
            poster_path = it.poster_path,
            overview = it.overview,
            isFavorite = false
        )
    }
}

fun GamesEntity.toMovies(): Games {
    return Games(
        id = id,
        title = title,
        release_date = release_date,
        poster_path = poster_path,
        overview = overview,
        isFavorite = isFavorite
    )
}

fun Games.toMoviesEntity(): GamesEntity {
    return GamesEntity(
        id = id ?: 0,
        title = title,
        release_date = release_date ?: "",
        poster_path = poster_path ?: "",
        overview = overview,
        isFavorite = true
    )
}

