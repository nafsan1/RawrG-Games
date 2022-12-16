package com.example.core.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00140\u0013H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0013H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0019\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001c"}, d2 = {"Lcom/example/core/repository/GamesRepositoryImpl;", "Lcom/example/core/repository/GamesRepository;", "dao", "Lcom/example/core/local/GamesDao;", "api", "Lcom/example/core/network/service/ApiServices;", "(Lcom/example/core/local/GamesDao;Lcom/example/core/network/service/ApiServices;)V", "deletedMovie", "", "games", "Lcom/example/core/domain/model/Games;", "(Lcom/example/core/domain/model/Games;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetail", "Lkotlin/Result;", "id", "", "getDetail-gIAlu-s", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorite", "Lkotlinx/coroutines/flow/Flow;", "", "getGames", "Landroidx/paging/PagingData;", "Lcom/example/core/domain/model/GamesResponse;", "getSearch", "query", "", "insertMovies", "core_debug"})
public final class GamesRepositoryImpl implements com.example.core.repository.GamesRepository {
    private final com.example.core.local.GamesDao dao = null;
    private final com.example.core.network.service.ApiServices api = null;
    
    public GamesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.core.local.GamesDao dao, @org.jetbrains.annotations.NotNull()
    com.example.core.network.service.ApiServices api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.core.domain.model.GamesResponse>> getGames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.core.domain.model.GamesResponse>> getSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertMovies(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games games, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletedMovie(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games games, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.core.domain.model.Games>> getFavorite() {
        return null;
    }
}