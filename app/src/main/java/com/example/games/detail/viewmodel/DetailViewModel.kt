package com.example.games.detail.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.core.domain.model.Games
import com.example.core.use_case.GamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val useCase: GamesUseCase
) : ViewModel() {

    private var job: Job? = null

    private var _uiState = MutableStateFlow<Games?>(null)

    val uiState: StateFlow<Games?>
        get() = _uiState.asStateFlow()

    fun insertMovies(games: Games) {
        viewModelScope.launch {
            useCase.insertGames.invoke(games)
        }
    }

    fun deletedMovies(games: Games) {
        viewModelScope.launch {
            useCase.deleteGames.invoke(games)
        }
    }

    fun getFavorite() = useCase.getFavorite.invoke().asLiveData()


    fun getDetail(id: Int) {
        job = viewModelScope.launch {
            useCase.getDetail.invoke(id).onSuccess {
                onSuccess(it)
            }.onFailure {
                onError(it)
            }
        }
    }

    private suspend fun onSuccess(detail: Games) {
        _uiState.emit(detail)
    }

    private fun onError( throwable: Throwable) {
        job?.cancel()
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
        job = null
    }

}
