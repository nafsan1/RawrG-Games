package com.example.core.use_case

import com.example.core.domain.model.Movies
import com.example.core.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow

class GetFavorite(
    private val repository: MoviesRepository
) {
    operator fun invoke(): Flow<List<Movies>> {
        return repository.getFavorite()
    }
}