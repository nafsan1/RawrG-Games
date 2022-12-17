package com.example.games.search.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/games/search/ui/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/games/search/adapter/SearchAdapter$Listener;", "()V", "adapter", "Lcom/example/games/search/adapter/SearchAdapter;", "binding", "Lcom/example/games/databinding/ActivitySearchBinding;", "viewModel", "Lcom/example/games/search/viewmodel/SearchViewModel;", "getViewModel", "()Lcom/example/games/search/viewmodel/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getSearch", "", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "data", "Lcom/example/core/domain/model/Games;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setupAdapter", "showLoadingAdapter", "isLoading", "toolbar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.games.search.adapter.SearchAdapter.Listener {
    private com.example.games.databinding.ActivitySearchBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.games.search.adapter.SearchAdapter adapter;
    
    public SearchActivity() {
        super();
    }
    
    private final com.example.games.search.viewmodel.SearchViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getSearch() {
    }
    
    private final com.example.games.databinding.ActivitySearchBinding onClick() {
        return null;
    }
    
    private final void toolbar() {
    }
    
    private final void setupAdapter() {
    }
    
    private final void showLoadingAdapter(boolean isLoading) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games data) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}