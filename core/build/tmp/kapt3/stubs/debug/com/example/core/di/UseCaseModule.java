package com.example.core.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/core/di/UseCaseModule;", "", "()V", "provideTrackerUseCases", "Lcom/example/core/use_case/GamesUseCase;", "repository", "Lcom/example/core/repository/GamesRepository;", "core_debug"})
@dagger.Module()
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.core.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.core.use_case.GamesUseCase provideTrackerUseCases(@org.jetbrains.annotations.NotNull()
    com.example.core.repository.GamesRepository repository) {
        return null;
    }
}