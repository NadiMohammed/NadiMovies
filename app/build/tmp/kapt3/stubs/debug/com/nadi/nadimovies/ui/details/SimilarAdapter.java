package com.nadi.nadimovies.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/nadi/nadimovies/ui/details/SimilarAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "Lcom/nadi/nadimovies/ui/details/SimilarAdapter$ViewHolder;", "onClickListener", "Lcom/nadi/nadimovies/ui/details/SimilarAdapter$OnSimilarClickListener;", "(Lcom/nadi/nadimovies/ui/details/SimilarAdapter$OnSimilarClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "OnSimilarClickListener", "ViewHolder", "app_debug"})
public final class SimilarAdapter extends androidx.recyclerview.widget.ListAdapter<com.nadi.nadimovies.domain.movie.Movie.Result, com.nadi.nadimovies.ui.details.SimilarAdapter.ViewHolder> {
    private final com.nadi.nadimovies.ui.details.SimilarAdapter.OnSimilarClickListener onClickListener = null;
    
    public SimilarAdapter(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.ui.details.SimilarAdapter.OnSimilarClickListener onClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nadi.nadimovies.ui.details.SimilarAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.ui.details.SimilarAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/nadi/nadimovies/ui/details/SimilarAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.nadi.nadimovies.domain.movie.Movie.Result> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result oldItem, @org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result oldItem, @org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nadi/nadimovies/ui/details/SimilarAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nadi/nadimovies/databinding/DesignSimilarBinding;", "(Lcom/nadi/nadimovies/databinding/DesignSimilarBinding;)V", "bind", "", "item", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "clickListener", "Lcom/nadi/nadimovies/ui/details/SimilarAdapter$OnSimilarClickListener;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nadi.nadimovies.databinding.DesignSimilarBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.nadi.nadimovies.ui.details.SimilarAdapter.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.nadi.nadimovies.databinding.DesignSimilarBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result item, @org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.ui.details.SimilarAdapter.OnSimilarClickListener clickListener) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nadi/nadimovies/ui/details/SimilarAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/nadi/nadimovies/ui/details/SimilarAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.nadi.nadimovies.ui.details.SimilarAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nadi/nadimovies/ui/details/SimilarAdapter$OnSimilarClickListener;", "", "onSimilarItemClick", "", "movie", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "app_debug"})
    public static abstract interface OnSimilarClickListener {
        
        public abstract void onSimilarItemClick(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result movie);
    }
}