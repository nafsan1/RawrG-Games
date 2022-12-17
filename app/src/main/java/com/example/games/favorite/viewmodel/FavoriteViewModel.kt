package com.example.games.favorite.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.core.domain.model.Games
import com.example.core.use_case.GamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val useCase: GamesUseCase
): ViewModel(){

    fun getFavorite() = useCase.getFavorite.invoke().asLiveData()
    fun deletedMovies(games: Games){
        viewModelScope.launch {
            useCase.deleteGames.invoke(games)
        }
    }
}