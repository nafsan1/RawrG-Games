package com.example.games.favorite.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/games/favorite/ui/FavoriteFragment;", "Lcom/example/games/base/BaseFragment;", "Lcom/example/games/databinding/FragmentFavoriteBinding;", "Lcom/example/games/favorite/adapter/FavoriteAdapter$Listener;", "()V", "adapter", "Lcom/example/games/favorite/adapter/FavoriteAdapter;", "viewModel", "Lcom/example/games/favorite/viewmodel/FavoriteViewModel;", "getViewModel", "()Lcom/example/games/favorite/viewmodel/FavoriteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getDataFavorite", "", "onDeleteClick", "data", "Lcom/example/core/domain/model/Games;", "onItemClick", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupAdapter", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FavoriteFragment extends com.example.games.base.BaseFragment<com.example.games.databinding.FragmentFavoriteBinding> implements com.example.games.favorite.adapter.FavoriteAdapter.Listener {
    private com.example.games.favorite.adapter.FavoriteAdapter adapter;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public FavoriteFragment() {
        super(null);
    }
    
    private final com.example.games.favorite.viewmodel.FavoriteViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getDataFavorite() {
    }
    
    private final com.example.games.databinding.FragmentFavoriteBinding setupAdapter(java.util.List<com.example.core.domain.model.Games> data) {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games data) {
    }
    
    @java.lang.Override()
    public void onDeleteClick(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games data) {
    }
}