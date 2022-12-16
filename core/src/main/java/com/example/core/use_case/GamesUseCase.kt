package com.example.core.use_case

data class MoviesUseCase(
    val getAllMovie: GetAllMovie,
    val getFavorite: GetFavorite,
    val insertMovies: InsertMovies,
    val deleteMovies: DeleteMovies
)
