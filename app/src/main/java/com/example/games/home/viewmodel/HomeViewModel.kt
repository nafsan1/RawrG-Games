package com.example.movies.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.core.use_case.MoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val moviesUseCase: MoviesUseCase
) : ViewModel() {

    fun getAllMovie() =
        moviesUseCase.getAllMovie.invoke().asLiveData()

}