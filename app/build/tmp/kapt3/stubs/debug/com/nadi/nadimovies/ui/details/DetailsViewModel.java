package com.nadi.nadimovies.ui.details;

import androidx.hilt.Assisted;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.*;
import com.nadi.core.OperationResult;
import com.nadi.core.movie.Movie;
import com.nadi.core.similar.SimilarUseCase;
import com.nadi.nadimovies.util.ApiStatus;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/nadi/nadimovies/ui/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "similarUseCase", "Lcom/nadi/core/similar/SimilarUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/nadi/core/similar/SimilarUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_onMessageError", "Landroidx/lifecycle/MutableLiveData;", "", "_property", "Lcom/nadi/core/movie/Movie;", "_selectedMovie", "Lcom/nadi/core/movie/Movie$Result;", "_status", "Lcom/nadi/nadimovies/util/ApiStatus;", "onMessageError", "Landroidx/lifecycle/LiveData;", "getOnMessageError", "()Landroidx/lifecycle/LiveData;", "property", "getProperty", "selectedMovie", "getSelectedMovie", "status", "getStatus", "getSimilarMoviesList", "", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final androidx.lifecycle.MutableLiveData<com.nadi.nadimovies.util.ApiStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> _onMessageError = null;
    private final androidx.lifecycle.MutableLiveData<com.nadi.core.movie.Movie> _property = null;
    private final androidx.lifecycle.MutableLiveData<com.nadi.core.movie.Movie.Result> _selectedMovie = null;
    private final com.nadi.core.similar.SimilarUseCase similarUseCase = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.nadimovies.util.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Object> getOnMessageError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.core.movie.Movie> getProperty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.core.movie.Movie.Result> getSelectedMovie() {
        return null;
    }
    
    private final void getSimilarMoviesList() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.nadi.core.similar.SimilarUseCase similarUseCase, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}