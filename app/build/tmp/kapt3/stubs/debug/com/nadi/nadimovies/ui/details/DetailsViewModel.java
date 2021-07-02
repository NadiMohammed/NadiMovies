package com.nadi.nadimovies.ui.details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0002R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001c\u00a8\u0006("}, d2 = {"Lcom/nadi/nadimovies/ui/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "similarUseCase", "Lcom/nadi/nadimovies/domain/similar/SimilarUseCase;", "movieUseCase", "Lcom/nadi/nadimovies/domain/movie/MovieUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/nadi/nadimovies/domain/similar/SimilarUseCase;Lcom/nadi/nadimovies/domain/movie/MovieUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_intentDataStore", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "kotlin.jvm.PlatformType", "_offlineMovies", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_onMessageError", "", "_property", "Lcom/nadi/nadimovies/domain/movie/Movie;", "_status", "Lcom/nadi/nadimovies/util/ApiStatus;", "intentDataStore", "getIntentDataStore", "()Landroidx/lifecycle/MutableLiveData;", "offlineMovies", "Lkotlinx/coroutines/flow/StateFlow;", "getOfflineMovies", "()Lkotlinx/coroutines/flow/StateFlow;", "onMessageError", "getOnMessageError", "property", "getProperty", "status", "getStatus", "getMoviesFromDB", "", "getSimilarMoviesList", "movieID", "", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.nadi.nadimovies.domain.similar.SimilarUseCase similarUseCase = null;
    private final com.nadi.nadimovies.domain.movie.MovieUseCase movieUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nadi.nadimovies.util.ApiStatus> _status = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> _onMessageError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.nadi.nadimovies.domain.movie.Movie.Result>> _offlineMovies = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nadi.nadimovies.domain.movie.Movie> _property = null;
    private final androidx.lifecycle.MutableLiveData<com.nadi.nadimovies.domain.movie.Movie.Result> _intentDataStore = null;
    
    @javax.inject.Inject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.domain.similar.SimilarUseCase similarUseCase, @org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.domain.movie.MovieUseCase movieUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nadi.nadimovies.util.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Object> getOnMessageError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.nadi.nadimovies.domain.movie.Movie.Result>> getOfflineMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nadi.nadimovies.domain.movie.Movie> getProperty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nadi.nadimovies.domain.movie.Movie.Result> getIntentDataStore() {
        return null;
    }
    
    private final void getSimilarMoviesList(int movieID) {
    }
    
    private final void getMoviesFromDB() {
    }
}