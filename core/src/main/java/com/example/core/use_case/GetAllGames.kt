package com.example.core.use_case

import androidx.paging.PagingData
import com.example.core.domain.model.Games
import com.example.core.mapper.toMovies
import com.example.core.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetAllMovie(
    private val repository: MoviesRepository
) {
     fun invoke(): Flow<PagingData<Games>> {
      return  repository.getAllMovies().map {
            it.toMovies()
        }
    }
}