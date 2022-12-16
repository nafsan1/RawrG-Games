package com.example.core.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MoviesEntity(
    @PrimaryKey
    @NonNull
    var id: Int,
    var moviesId: Int,
    var title: String,
    var release_date: String,
    var poster_path: String,
    var overview: String,
    var isFavorite:Boolean = false
)
