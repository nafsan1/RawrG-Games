package com.example.games.favorite.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/games/favorite/viewmodel/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/example/core/use_case/GamesUseCase;", "(Lcom/example/core/use_case/GamesUseCase;)V", "deletedMovies", "", "games", "Lcom/example/core/domain/model/Games;", "getFavorite", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.use_case.GamesUseCase useCase = null;
    
    @javax.inject.Inject()
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.core.use_case.GamesUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.core.domain.model.Games>> getFavorite() {
        return null;
    }
    
    public final void deletedMovies(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games games) {
    }
}