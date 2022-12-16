package com.example.games.home.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/example/games/home/ui/HomeFragment;", "Lcom/example/games/base/BaseFragment;", "Lcom/example/games/databinding/FragmentHomeBinding;", "Lcom/example/games/home/adapter/HomeAdapter$Listener;", "()V", "adapter", "Lcom/example/games/home/adapter/HomeAdapter;", "viewModel", "Lcom/example/games/home/viewmodel/HomeViewModel;", "getViewModel", "()Lcom/example/games/home/viewmodel/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getData", "", "onClick", "onItemClick", "data", "Lcom/example/core/domain/model/Games;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupAdapter", "showLoadingAdapter", "isLoading", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.example.games.base.BaseFragment<com.example.games.databinding.FragmentHomeBinding> implements com.example.games.home.adapter.HomeAdapter.Listener {
    private com.example.games.home.adapter.HomeAdapter adapter;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public HomeFragment() {
        super(null);
    }
    
    private final com.example.games.home.viewmodel.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.example.games.databinding.FragmentHomeBinding onClick() {
        return null;
    }
    
    private final void getData() {
    }
    
    private final void setupAdapter() {
    }
    
    private final void showLoadingAdapter(boolean isLoading) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.Games data) {
    }
}