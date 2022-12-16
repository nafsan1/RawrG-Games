package com.example.core.use_case

import com.example.core.domain.model.Games
import com.example.core.repository.MoviesRepository

class DeleteMovies(private val repository: MoviesRepository) {
    suspend operator fun invoke(games:Games){
        repository.deletedMovie(games)
    }
}