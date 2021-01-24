package com.nadi.nadimovies.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.nadi.core.movie.Movie;
import com.nadi.nadimovies.R;
import com.nadi.nadimovies.databinding.FragmentHomeBinding;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/nadi/nadimovies/ui/home/HomeAdapter$OnMovieClickListener;", "()V", "binding", "Lcom/nadi/nadimovies/databinding/FragmentHomeBinding;", "viewModel", "Lcom/nadi/nadimovies/ui/home/HomeViewModel;", "getViewModel", "()Lcom/nadi/nadimovies/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToMovieDetails", "", "movie", "Lcom/nadi/core/movie/Movie$Result;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMovieItemClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.nadi.nadimovies.databinding.FragmentHomeBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    private final com.nadi.nadimovies.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void navigateToMovieDetails(com.nadi.core.movie.Movie.Result movie) {
    }
    
    @java.lang.Override()
    public void onMovieItemClick(@org.jetbrains.annotations.NotNull()
    com.nadi.core.movie.Movie.Result movie) {
    }
    
    public HomeFragment() {
        super();
    }
}