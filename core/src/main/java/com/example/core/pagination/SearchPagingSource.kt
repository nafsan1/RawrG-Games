package com.example.core.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.core.domain.model.GamesResponse
import com.example.core.network.service.ApiServices
import com.example.core.util.ITEM_PAGE_ADD_WATCHLIST
import com.example.core.util.WATCHLIST_STARTING_PAGE_INDEX
import retrofit2.HttpException
import java.io.IOException
import java.lang.Exception

class RecommendPagingSource(
    private val api: ApiServices,
    private val movieId: Int
) : PagingSource<Int, GamesResponse>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GamesResponse> {
        val position = params.key ?: WATCHLIST_STARTING_PAGE_INDEX
        return try {
            val response = api.getGames(page = position)
            val responseData = mutableListOf<GamesResponse>()
            val data = response.games
            responseData.addAll(data)
            LoadResult.Page(
                data = responseData,
                prevKey = if (position == WATCHLIST_STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (responseData.isEmpty() || data.size < ITEM_PAGE_ADD_WATCHLIST) null else position + 1
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, GamesResponse>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

}