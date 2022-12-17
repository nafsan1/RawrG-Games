package com.example.core.use_case

import com.example.core.domain.model.Games
import com.example.core.repository.GamesRepository
import kotlinx.coroutines.flow.Flow

class GetFavorite(
    private val repository: GamesRepository
) {
    operator fun invoke(): Flow<List<Games>> {
        return repository.getFavorite()
    }
}