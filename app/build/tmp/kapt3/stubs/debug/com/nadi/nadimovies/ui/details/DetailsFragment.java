package com.nadi.nadimovies.ui.details;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/nadi/nadimovies/ui/details/DetailsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/nadi/nadimovies/ui/details/SimilarAdapter$OnSimilarClickListener;", "()V", "_binding", "Lcom/nadi/nadimovies/databinding/FragmentDetailsBinding;", "binding", "getBinding", "()Lcom/nadi/nadimovies/databinding/FragmentDetailsBinding;", "similarAdapter", "Lcom/nadi/nadimovies/ui/details/SimilarAdapter;", "viewModel", "Lcom/nadi/nadimovies/ui/details/DetailsViewModel;", "getViewModel", "()Lcom/nadi/nadimovies/ui/details/DetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "applyData", "", "init", "navigateToMovieSimilarDetails", "movie", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "navigateToTrailer", "observe", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSimilarItemClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailsFragment extends androidx.fragment.app.Fragment implements com.nadi.nadimovies.ui.details.SimilarAdapter.OnSimilarClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.nadi.nadimovies.databinding.FragmentDetailsBinding _binding;
    private com.nadi.nadimovies.ui.details.SimilarAdapter similarAdapter;
    
    public DetailsFragment() {
        super();
    }
    
    private final com.nadi.nadimovies.ui.details.DetailsViewModel getViewModel() {
        return null;
    }
    
    private final com.nadi.nadimovies.databinding.FragmentDetailsBinding getBinding() {
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
    
    private final void applyData() {
    }
    
    private final void navigateToMovieSimilarDetails(com.nadi.nadimovies.domain.movie.Movie.Result movie) {
    }
    
    private final void navigateToTrailer() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSimilarItemClick(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.domain.movie.Movie.Result movie) {
    }
}