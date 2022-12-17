package com.example.core.use_case

import com.example.core.domain.model.Games
import com.example.core.repository.GamesRepository

class DeleteGames(private val repository: GamesRepository) {
    suspend operator fun invoke(games:Games){
        repository.deletedGames(games)
    }
}