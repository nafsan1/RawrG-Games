package com.example.games.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.core.use_case.GamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCase: GamesUseCase
) : ViewModel() {

    fun getGames() =
        useCase.getAllGames.invoke().asLiveData()

}