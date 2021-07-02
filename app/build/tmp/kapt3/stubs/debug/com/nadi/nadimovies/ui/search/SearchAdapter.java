package com.nadi.nadimovies.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/nadi/nadimovies/ui/search/SearchAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nadi/nadimovies/domain/search/SearchResults;", "Lcom/nadi/nadimovies/ui/search/SearchAdapter$ViewHolder;", "onSearchClickListener", "Lcom/nadi/nadimovies/ui/search/SearchAdapter$OnSearchClickListener;", "(Lcom/nadi/nadimovies/ui/search/SearchAdapter$OnSearchClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "OnSearchClickListener", "ViewHolder", "app_debug"})
public final class SearchAdapter extends androidx.recyclerview.widget.ListAdapter<com.nadi.nadimovies.domain.search.SearchResults, com.nadi.nadimovies.ui.search.SearchAdapter.ViewHolder> {
    private final com.nadi.nadimovies.ui.search.SearchAdapter.OnSearchClickListener onSearchClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.nadi.nadimovies.ui.search.SearchAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.nadi.nadimovies.domain.search.SearchResults> DiffCallback = null;
    
    public SearchAdapter(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.ui.search.SearchAdapter.OnSearchClickListener onSearchClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nadi.nadimovies.ui.search.SearchAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.ui.search.SearchAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nadi/nadimovies/ui/search/SearchAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nadi/nadimovies/databinding/DesignSearchMoviesBinding;", "(Lcom/nadi/nadimovies/databinding/DesignSearchMoviesBinding;)V", "bind", "", "item", "Lcom/nadi/nadimovies/domain/search/SearchResults;", "clickListener", "Lcom/nadi/nadimovies/ui/search/SearchAdapter$OnSearchClickListener;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nadi.nadimovies.databinding.DesignSearchMoviesBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.nadi.nadimovies.ui.search.SearchAdapter.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.nadi.nadimovies.databinding.DesignSearchMoviesBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.search.SearchResults item, @org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.ui.search.SearchAdapter.OnSearchClickListener clickListener) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nadi/nadimovies/ui/search/SearchAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/nadi/nadimovies/ui/search/SearchAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.nadi.nadimovies.ui.search.SearchAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nadi/nadimovies/ui/search/SearchAdapter$OnSearchClickListener;", "", "onSearchItemClick", "", "search", "Lcom/nadi/nadimovies/domain/search/SearchResults;", "app_debug"})
    public static abstract interface OnSearchClickListener {
        
        public abstract void onSearchItemClick(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.search.SearchResults search);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/nadi/nadimovies/ui/search/SearchAdapter$Companion;", "", "()V", "DiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/nadi/nadimovies/domain/search/SearchResults;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}