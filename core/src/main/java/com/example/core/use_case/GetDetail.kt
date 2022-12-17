package com.example.core.use_case

import com.example.core.domain.model.Games
import com.example.core.repository.GamesRepository

class GetDetail(private val repository: GamesRepository) {

    suspend operator fun invoke(
        id: Int
    ): Result<Games> {
        return repository.getDetail(id)
    }
}