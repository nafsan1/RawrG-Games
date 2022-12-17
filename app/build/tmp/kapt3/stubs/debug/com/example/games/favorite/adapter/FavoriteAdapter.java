package com.example.games.favorite.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/games/favorite/adapter/FavoriteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/games/favorite/adapter/FavoriteAdapter$MoviesViewHolder;", "myData", "", "Lcom/example/core/domain/model/Games;", "listener", "Lcom/example/games/favorite/adapter/FavoriteAdapter$Listener;", "(Ljava/util/List;Lcom/example/games/favorite/adapter/FavoriteAdapter$Listener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "MoviesViewHolder", "app_debug"})
public final class FavoriteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.games.favorite.adapter.FavoriteAdapter.MoviesViewHolder> {
    private final java.util.List<com.example.core.domain.model.Games> myData = null;
    private final com.example.games.favorite.adapter.FavoriteAdapter.Listener listener = null;
    
    public FavoriteAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.core.domain.model.Games> myData, @org.jetbrains.annotations.NotNull()
    com.example.games.favorite.adapter.FavoriteAdapter.Listener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.games.favorite.adapter.FavoriteAdapter.MoviesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.games.favorite.adapter.FavoriteAdapter.MoviesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/games/favorite/adapter/FavoriteAdapter$MoviesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/games/databinding/ItemLayoutBinding;", "(Lcom/example/games/favorite/adapter/FavoriteAdapter;Lcom/example/games/databinding/ItemLayoutBinding;)V", "bind", "", "data", "Lcom/example/core/domain/model/Games;", "app_debug"})
    public final class MoviesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.games.databinding.ItemLayoutBinding binding = null;
        
        public MoviesViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.games.databinding.ItemLayoutBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"NotifyDataSetChanged", "SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.core.domain.model.Games data) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/games/favorite/adapter/FavoriteAdapter$Listener;", "", "onDeleteClick", "", "data", "Lcom/example/core/domain/model/Games;", "onItemClick", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.core.domain.model.Games data);
        
        public abstract void onDeleteClick(@org.jetbrains.annotations.NotNull()
        com.example.core.domain.model.Games data);
    }
}