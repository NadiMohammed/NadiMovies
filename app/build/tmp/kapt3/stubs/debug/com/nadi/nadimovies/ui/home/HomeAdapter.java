package com.nadi.nadimovies.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewType", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$MoviesViewType;", "onClickListener", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$OnMovieClickListener;", "(Lcom/nadi/nadimovies/ui/home/HomeAdapter$MoviesViewType;Lcom/nadi/nadimovies/ui/home/HomeAdapter$OnMovieClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Companion", "MoviePagerViewHolder", "MoviesViewType", "OnMovieClickListener", "ViewHolder", "app_debug"})
public final class HomeAdapter extends androidx.recyclerview.widget.ListAdapter<com.nadi.nadimovies.domain.movie.Movie.Result, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.nadi.nadimovies.ui.home.HomeAdapter.MoviesViewType viewType = null;
    private final com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener onClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.nadi.nadimovies.ui.home.HomeAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.nadi.nadimovies.domain.movie.Movie.Result> DiffCallback = null;
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.ui.home.HomeAdapter.MoviesViewType viewType, @org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener onClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter$MoviePagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nadi/nadimovies/databinding/DesignHomeViewpagerBinding;", "(Lcom/nadi/nadimovies/databinding/DesignHomeViewpagerBinding;)V", "bind", "", "item", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "clickListener", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$OnMovieClickListener;", "Companion", "app_debug"})
    public static final class MoviePagerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nadi.nadimovies.databinding.DesignHomeViewpagerBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.nadi.nadimovies.ui.home.HomeAdapter.MoviePagerViewHolder.Companion Companion = null;
        
        public MoviePagerViewHolder(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.databinding.DesignHomeViewpagerBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result item, @org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener clickListener) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter$MoviePagerViewHolder$Companion;", "", "()V", "from", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$MoviePagerViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.nadi.nadimovies.ui.home.HomeAdapter.MoviePagerViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nadi/nadimovies/databinding/DesignMoviesBinding;", "(Lcom/nadi/nadimovies/databinding/DesignMoviesBinding;)V", "bind", "", "item", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "clickListener", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$OnMovieClickListener;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nadi.nadimovies.databinding.DesignMoviesBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.nadi.nadimovies.ui.home.HomeAdapter.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.nadi.nadimovies.databinding.DesignMoviesBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result item, @org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener clickListener) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.nadi.nadimovies.ui.home.HomeAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter$OnMovieClickListener;", "", "onMovieItemClick", "", "movie", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "app_debug"})
    public static abstract interface OnMovieClickListener {
        
        public abstract void onMovieItemClick(@org.jetbrains.annotations.NotNull()
        com.nadi.nadimovies.domain.movie.Movie.Result movie);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter$MoviesViewType;", "", "(Ljava/lang/String;I)V", "PAGER", "NORMAL", "app_debug"})
    public static enum MoviesViewType {
        /*public static final*/ PAGER /* = new PAGER() */,
        /*public static final*/ NORMAL /* = new NORMAL() */;
        
        MoviesViewType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeAdapter$Companion;", "", "()V", "DiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}