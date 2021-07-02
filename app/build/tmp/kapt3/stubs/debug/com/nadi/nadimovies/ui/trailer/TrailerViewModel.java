package com.nadi.nadimovies.ui.trailer;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/nadi/nadimovies/ui/trailer/TrailerViewModel;", "Landroidx/lifecycle/ViewModel;", "trailerUseCase", "Lcom/nadi/nadimovies/domain/trailer/TrailerUseCase;", "(Lcom/nadi/nadimovies/domain/trailer/TrailerUseCase;)V", "_onMessageError", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_property", "Lcom/nadi/nadimovies/domain/trailer/Trailer;", "_status", "Lcom/nadi/nadimovies/util/ApiStatus;", "onMessageError", "Lkotlinx/coroutines/flow/StateFlow;", "getOnMessageError", "()Lkotlinx/coroutines/flow/StateFlow;", "property", "getProperty", "status", "getStatus", "getMovieTrailer", "", "movieID", "", "app_debug"})
public final class TrailerViewModel extends androidx.lifecycle.ViewModel {
    private final com.nadi.nadimovies.domain.trailer.TrailerUseCase trailerUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nadi.nadimovies.util.ApiStatus> _status = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> _onMessageError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nadi.nadimovies.domain.trailer.Trailer> _property = null;
    
    @javax.inject.Inject()
    public TrailerViewModel(@org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.domain.trailer.TrailerUseCase trailerUseCase) {
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
    public final kotlinx.coroutines.flow.StateFlow<com.nadi.nadimovies.domain.trailer.Trailer> getProperty() {
        return null;
    }
    
    public final void getMovieTrailer(int movieID) {
    }
}