package com.example.core.di

import com.example.core.repository.GamesRepository
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
        repository: GamesRepository
    ): GamesUseCase {
        return GamesUseCase(
            getAllGames = GetAllGames(repository),
            getFavorite = GetFavorite(repository),
            insertGames = InsertGames(repository),
            deleteGames = DeleteGames(repository),
            getSearch = GetSearch(repository),
            getDetail = GetDetail(repository)
        )
    }
}