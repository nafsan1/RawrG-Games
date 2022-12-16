package com.example.games.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.core.use_case.GamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val moviesUseCase: GamesUseCase
) : ViewModel() {

    fun getAllMovie() =
        moviesUseCase.getAllGames.invoke().asLiveData()

}