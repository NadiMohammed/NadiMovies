package com.nadi.nadimovies.ui.home;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001c\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/nadi/nadimovies/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/nadi/nadimovies/domain/movie/MovieUseCase;", "(Lcom/nadi/nadimovies/domain/movie/MovieUseCase;)V", "_offlineMovies", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "_onMessageError", "", "_property", "Lcom/nadi/nadimovies/domain/movie/Movie;", "_status", "Lcom/nadi/nadimovies/util/ApiStatus;", "offlineMovies", "Lkotlinx/coroutines/flow/StateFlow;", "getOfflineMovies", "()Lkotlinx/coroutines/flow/StateFlow;", "onMessageError", "getOnMessageError", "property", "getProperty", "status", "getStatus", "getMoviesFromDB", "", "getNowPlayingMoviesList", "saveMoviesInDB", "movie", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.nadi.nadimovies.domain.movie.MovieUseCase movieUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nadi.nadimovies.util.ApiStatus> _status = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nadi.nadimovies.domain.movie.Movie> _property = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.nadi.nadimovies.domain.movie.Movie.Result>> _offlineMovies = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> _onMessageError = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.domain.movie.MovieUseCase movieUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nadi.nadimovies.util.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nadi.nadimovies.domain.movie.Movie> getProperty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.nadi.nadimovies.domain.movie.Movie.Result>> getOfflineMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Object> getOnMessageError() {
        return null;
    }
    
    private final void getNowPlayingMoviesList() {
    }
    
    private final void saveMoviesInDB(java.util.List<com.nadi.nadimovies.domain.movie.Movie.Result> movie) {
    }
    
    private final void getMoviesFromDB() {
    }
}