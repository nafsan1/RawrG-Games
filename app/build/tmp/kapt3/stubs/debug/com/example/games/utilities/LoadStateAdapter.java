package com.example.games.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00052\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/games/utilities/LoadStateAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lcom/example/games/utilities/LoadStateAdapter$LoadStateViewHolder;", "retry", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "LoadStateViewHolder", "app_debug"})
public final class LoadStateAdapter extends androidx.paging.LoadStateAdapter<com.example.games.utilities.LoadStateAdapter.LoadStateViewHolder> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
    
    public LoadStateAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.games.utilities.LoadStateAdapter.LoadStateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.games.utilities.LoadStateAdapter.LoadStateViewHolder holder, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/games/utilities/LoadStateAdapter$LoadStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/games/databinding/LoadStateFooterBinding;", "(Lcom/example/games/utilities/LoadStateAdapter;Lcom/example/games/databinding/LoadStateFooterBinding;)V", "bind", "", "loadState", "Landroidx/paging/LoadState;", "app_debug"})
    public final class LoadStateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.games.databinding.LoadStateFooterBinding binding = null;
        
        public LoadStateViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.games.databinding.LoadStateFooterBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
    }
}