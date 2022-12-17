package com.example.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Games(
    val id: Int?,
    val rating: Double,
    val name: String,
    val released: String? = "",
    val background_image: String? = "",
    val description: String? = "",
    val isFavorite: Boolean
): Parcelable