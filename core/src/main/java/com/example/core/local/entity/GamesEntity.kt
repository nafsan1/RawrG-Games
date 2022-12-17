package com.example.core.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "games")
data class GamesEntity(
    @PrimaryKey
    @NonNull
    val id: Int?,
    val rating: Double,
    val name: String,
    val released: String? = "",
    val background_image: String? = "",
    val description: String? = "",
    val isFavorite: Boolean
)