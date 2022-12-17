package com.example.core.use_case

data class GamesUseCase(
    val getAllGames: GetAllGames,
    val getFavorite: GetFavorite,
    val insertGames: InsertGames,
    val deleteGames: DeleteGames,
    val getSearch: GetSearch,
    val getDetail: GetDetail
)
