package com.example.movies.favorite.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.core.domain.model.Movies
import com.example.core.use_case.MoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val moviesUseCase: MoviesUseCase
): ViewModel(){

    fun getFavorite() = moviesUseCase.getFavorite.invoke().asLiveData()
    fun deletedMovies(movies: Movies){
        viewModelScope.launch {
            moviesUseCase.deleteMovies.invoke(movies)
        }
    }
}