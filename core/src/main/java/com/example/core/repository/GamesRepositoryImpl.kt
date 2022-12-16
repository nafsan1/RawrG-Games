package com.example.core.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.core.domain.model.Games
import com.example.core.domain.model.GamesResponse
import com.example.core.local.GamesDao
import com.example.core.mapper.toGames
import com.example.core.mapper.toGamesEntity
import com.example.core.network.service.ApiServices
import com.example.core.pagination.GamesPagingSource
import com.example.core.pagination.RecommendPagingSource
import com.example.core.util.ITEM_PAGE_ADD_WATCHLIST
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MoviesRepositoryImpl(
    private val dao: GamesDao,
    private val api: ApiServices
) : MoviesRepository {

    override fun getAllMovies(): Flow<PagingData<GamesResponse>> {
        return Pager(
            PagingConfig(pageSize = ITEM_PAGE_ADD_WATCHLIST, enablePlaceholders = false)
        ) {
            GamesPagingSource(api)
        }.flow
    }

    override fun getRecommendMovies(movieId: Int): Flow<PagingData<GamesResponse>> {
        return Pager(
            PagingConfig(pageSize = ITEM_PAGE_ADD_WATCHLIST, enablePlaceholders = false)
        ) {
            RecommendPagingSource(api = api,movieId = movieId)
        }.flow
    }

    override suspend fun getDetail(id: Int): Result<List<Games>> {
       return try {
           val detail = api.getDetail(id = id)
           Result.success(
               detail.
           )
       }
    }

    override suspend fun insertMovies(games: Games) {
        dao.insertGames(games.toGamesEntity())
    }

    override suspend fun deletedMovie(games: Games) {
        dao.deleteGames(games.toGamesEntity())
    }

    override fun getFavorite(): Flow<List<Games>> {
        return dao.getFavorite().map { entities ->
            entities.map {
                it.toGames()
            }
        }
    }


}