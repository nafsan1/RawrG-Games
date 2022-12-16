package com.example.games.detail.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u000fH\u0014J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0019\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/games/detail/viewmodel/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/example/core/use_case/GamesUseCase;", "(Lcom/example/core/use_case/GamesUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/core/domain/model/Games;", "job", "Lkotlinx/coroutines/Job;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deletedMovies", "", "games", "getDetail", "id", "", "getFavorite", "Landroidx/lifecycle/LiveData;", "", "insertMovies", "onCleared", "onError", "throwable", "", "onSuccess", "detail", "(Lcom/example/core/domain/model/Games;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.use_case.GamesUseCase useCase = null;
    private kotlinx.coroutines.Job job;
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.core.domain.model.Games> _uiState;
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.core.use_case.GamesUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.core.domain.model.Games> getUiState() {
        return null;
    }
    
    public final void insertMovies(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games games) {
    }
    
    public final void deletedMovies(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games games) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.core.domain.model.Games>> getFavorite() {
        return null;
    }
    
    public final void getDetail(int id) {
    }
    
    private final java.lang.Object onSuccess(com.example.core.domain.model.Games detail, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}