package com.nadi.nadimovies.ui.home;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.nadi.core.OperationResult;
import com.nadi.core.movie.Movie;
import com.nadi.core.movie.MovieUseCase;
import com.nadi.nadimovies.util.ApiStatus;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/nadi/core/movie/MovieUseCase;", "(Lcom/nadi/core/movie/MovieUseCase;)V", "_onMessageError", "Landroidx/lifecycle/MutableLiveData;", "", "_property", "Lcom/nadi/core/movie/Movie;", "_status", "Lcom/nadi/nadimovies/util/ApiStatus;", "_upcoming", "onMessageError", "Landroidx/lifecycle/LiveData;", "getOnMessageError", "()Landroidx/lifecycle/LiveData;", "property", "getProperty", "status", "getStatus", "upcoming", "getUpcoming", "getNowPlayingMoviesList", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.nadi.nadimovies.util.ApiStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<com.nadi.core.movie.Movie> _property = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> _onMessageError = null;
    private final androidx.lifecycle.MutableLiveData<com.nadi.core.movie.Movie> _upcoming = null;
    private final com.nadi.core.movie.MovieUseCase movieUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.nadimovies.util.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.core.movie.Movie> getProperty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Object> getOnMessageError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.core.movie.Movie> getUpcoming() {
        return null;
    }
    
    private final void getNowPlayingMoviesList() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.nadi.core.movie.MovieUseCase movieUseCase) {
        super();
    }
}