package com.example.games.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0012\u0013\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/games/home/adapter/HomeAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/core/domain/model/Games;", "Lcom/example/games/home/adapter/HomeAdapter$ViewHolder;", "listener", "Lcom/example/games/home/adapter/HomeAdapter$Listener;", "(Lcom/example/games/home/adapter/HomeAdapter$Listener;)V", "getListener", "()Lcom/example/games/home/adapter/HomeAdapter$Listener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "Listener", "ViewHolder", "app_debug"})
public final class HomeAdapter extends androidx.paging.PagingDataAdapter<com.example.core.domain.model.Games, com.example.games.home.adapter.HomeAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.games.home.adapter.HomeAdapter.Listener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.games.home.adapter.HomeAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.core.domain.model.Games> WATCHLIST_COMPARATOR = null;
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    com.example.games.home.adapter.HomeAdapter.Listener listener) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.games.home.adapter.HomeAdapter.Listener getListener() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.games.home.adapter.HomeAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.games.home.adapter.HomeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/games/home/adapter/HomeAdapter$Listener;", "", "onItemClick", "", "data", "Lcom/example/core/domain/model/Games;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.core.domain.model.Games data);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/games/home/adapter/HomeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/games/databinding/ItemLayoutBinding;", "(Lcom/example/games/home/adapter/HomeAdapter;Lcom/example/games/databinding/ItemLayoutBinding;)V", "bind", "", "data", "Lcom/example/core/domain/model/Games;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.games.databinding.ItemLayoutBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.games.databinding.ItemLayoutBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.core.domain.model.Games data) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/games/home/adapter/HomeAdapter$Companion;", "", "()V", "WATCHLIST_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/core/domain/model/Games;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}