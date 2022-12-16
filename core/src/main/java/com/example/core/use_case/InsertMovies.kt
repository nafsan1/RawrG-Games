package com.example.core.use_case

import com.example.core.domain.model.Movies
import com.example.core.repository.MoviesRepository

class InsertMovies(private val repository: MoviesRepository) {
    suspend  operator fun invoke(movies:Movies){
        repository.insertMovies(
           movies
        )
    }
}