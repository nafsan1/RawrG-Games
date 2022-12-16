package com.example.core.use_case

import androidx.paging.PagingData
import com.example.core.domain.model.Games
import com.example.core.mapper.toGames
import com.example.core.repository.GamesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetSearchGame(
    private val repository: GamesRepository
) {
    fun invoke(query: String): Flow<PagingData<Games>> {
        return repository.getSearch(query).map {
            it.toGames()
        }
    }
}