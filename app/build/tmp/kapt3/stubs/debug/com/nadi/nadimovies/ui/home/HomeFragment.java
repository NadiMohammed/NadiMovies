package com.nadi.nadimovies.ui.home;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$OnMovieClickListener;", "()V", "_binding", "Lcom/nadi/nadimovies/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/nadi/nadimovies/databinding/FragmentHomeBinding;", "homeAdapter", "Lcom/nadi/nadimovies/ui/home/HomeAdapter;", "upcomingMoviesAdapter", "viewModel", "Lcom/nadi/nadimovies/ui/home/HomeViewModel;", "getViewModel", "()Lcom/nadi/nadimovies/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "navigateToMovieDetails", "movie", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "observe", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onMovieItemClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.nadi.nadimovies.databinding.FragmentHomeBinding _binding;
    private com.nadi.nadimovies.ui.home.HomeAdapter homeAdapter;
    private com.nadi.nadimovies.ui.home.HomeAdapter upcomingMoviesAdapter;
    
    public HomeFragment() {
        super();
    }
    
    private final com.nadi.nadimovies.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    private final com.nadi.nadimovies.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    private final void observe() {
    }
    
    private final void navigateToMovieDetails(com.nadi.nadimovies.domain.movie.Movie.Result movie) {
    }
    
    @java.lang.Override()
    public void onMovieItemClick(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.domain.movie.Movie.Result movie) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}