package com.example.core.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/core/di/GamesModule;", "", "()V", "provideMoviesApi", "Lcom/example/core/network/service/ApiServices;", "client", "Lokhttp3/OkHttpClient;", "provideMoviesRepository", "Lcom/example/core/repository/GamesRepository;", "api", "db", "Lcom/example/core/local/GamesDatabase;", "provideOkhttpClient", "provideTrackerDatabase", "app", "Landroid/app/Application;", "core_debug"})
@dagger.Module()
public final class GamesModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.core.di.GamesModule INSTANCE = null;
    
    private GamesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkhttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.core.network.service.ApiServices provideMoviesApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.core.local.GamesDatabase provideTrackerDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.core.repository.GamesRepository provideMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.example.core.network.service.ApiServices api, @org.jetbrains.annotations.NotNull()
    com.example.core.local.GamesDatabase db) {
        return null;
    }
}