package com.example.core.di

import com.example.core.repository.MoviesRepository
import com.example.core.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @ViewModelScoped
    @Provides
    fun provideTrackerUseCases(
        repository: MoviesRepository
    ): MoviesUseCase {
        return MoviesUseCase(
            getAllMovie = GetAllMovie(repository),
            getFavorite = GetFavorite(repository),
            insertMovies = InsertMovies(repository),
            deleteMovies = DeleteMovies(repository)
        )
    }
}