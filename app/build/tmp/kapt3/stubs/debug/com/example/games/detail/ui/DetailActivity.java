package com.example.games.detail.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\b\u0010\u001c\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/example/games/detail/ui/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/games/databinding/ActivityDetailMoviesBinding;", "games", "Lcom/example/core/domain/model/Games;", "viewModel", "Lcom/example/games/detail/viewmodel/DetailViewModel;", "getViewModel", "()Lcom/example/games/detail/viewmodel/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getDetail", "", "getIntentData", "initToolbar", "message", "", "onCLick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setData", "setFavButton", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.games.databinding.ActivityDetailMoviesBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.core.domain.model.Games games;
    
    public DetailActivity() {
        super();
    }
    
    private final com.example.games.detail.viewmodel.DetailViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.example.games.databinding.ActivityDetailMoviesBinding setFavButton() {
        return null;
    }
    
    private final com.example.games.databinding.ActivityDetailMoviesBinding onCLick() {
        return null;
    }
    
    private final void getIntentData() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final com.example.games.databinding.ActivityDetailMoviesBinding setData(com.example.core.domain.model.Games games) {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final com.example.games.databinding.ActivityDetailMoviesBinding initToolbar(java.lang.String message) {
        return null;
    }
    
    private final void getDetail() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}