package com.example.games.search.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.core.use_case.GamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val useCase: GamesUseCase
) : ViewModel() {

    fun getSearch(query:String) =
        useCase.getSearch.invoke(query).asLiveData()

}