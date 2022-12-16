package com.example.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movies(
    val id: Int? = null,
    val moviesId: Int? = null,
    val title: String,
    var release_date: String? = "",
    var poster_path: String? = "",
    val overview: String,
    var isFavorite:Boolean = false
): Parcelable