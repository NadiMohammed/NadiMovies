package com.nadi.nadimovies.ui.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.nadi.core.movie.Movie;
import com.nadi.nadimovies.R;
import com.nadi.nadimovies.databinding.FragmentDetailsBinding;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/nadi/nadimovies/ui/details/DetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/nadi/nadimovies/databinding/FragmentDetailsBinding;", "nowPlayingResponse", "Lcom/nadi/nadimovies/ui/details/DetailsFragmentArgs;", "getNowPlayingResponse", "()Lcom/nadi/nadimovies/ui/details/DetailsFragmentArgs;", "nowPlayingResponse$delegate", "Landroidx/navigation/NavArgsLazy;", "viewModel", "Lcom/nadi/nadimovies/ui/details/DetailsViewModel;", "getViewModel", "()Lcom/nadi/nadimovies/ui/details/DetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToMovieSimilarDetails", "", "movie", "Lcom/nadi/core/movie/Movie$Result;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailsFragment extends androidx.fragment.app.Fragment {
    private final androidx.navigation.NavArgsLazy nowPlayingResponse$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.nadi.nadimovies.databinding.FragmentDetailsBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    private final com.nadi.nadimovies.ui.details.DetailsFragmentArgs getNowPlayingResponse() {
        return null;
    }
    
    private final com.nadi.nadimovies.ui.details.DetailsViewModel getViewModel() {
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
    
    private final void navigateToMovieSimilarDetails(com.nadi.core.movie.Movie.Result movie) {
    }
    
    public DetailsFragment() {
        super();
    }
}