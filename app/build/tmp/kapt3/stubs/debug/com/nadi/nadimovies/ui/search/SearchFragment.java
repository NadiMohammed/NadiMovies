package com.nadi.nadimovies.ui.search;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/nadi/nadimovies/ui/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/nadi/nadimovies/ui/search/SearchAdapter$OnSearchClickListener;", "()V", "_binding", "Lcom/nadi/nadimovies/databinding/SearchFragmentBinding;", "binding", "getBinding", "()Lcom/nadi/nadimovies/databinding/SearchFragmentBinding;", "searchAdapter", "Lcom/nadi/nadimovies/ui/search/SearchAdapter;", "viewModel", "Lcom/nadi/nadimovies/ui/search/SearchViewModel;", "getViewModel", "()Lcom/nadi/nadimovies/ui/search/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "observe", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSearchItemClick", "search", "Lcom/nadi/nadimovies/domain/search/SearchResults;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends androidx.fragment.app.Fragment implements com.nadi.nadimovies.ui.search.SearchAdapter.OnSearchClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.nadi.nadimovies.databinding.SearchFragmentBinding _binding;
    private com.nadi.nadimovies.ui.search.SearchAdapter searchAdapter;
    
    public SearchFragment() {
        super();
    }
    
    private final com.nadi.nadimovies.ui.search.SearchViewModel getViewModel() {
        return null;
    }
    
    private final com.nadi.nadimovies.databinding.SearchFragmentBinding getBinding() {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSearchItemClick(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.domain.search.SearchResults search) {
    }
}