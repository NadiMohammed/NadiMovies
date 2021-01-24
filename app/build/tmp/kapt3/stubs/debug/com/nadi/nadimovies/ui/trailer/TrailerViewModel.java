package com.nadi.nadimovies.ui.trailer;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.nadi.core.OperationResult;
import com.nadi.core.trailer.Trailer;
import com.nadi.core.trailer.TrailerUseCase;
import com.nadi.nadimovies.util.ApiStatus;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/nadi/nadimovies/ui/trailer/TrailerViewModel;", "Landroidx/lifecycle/ViewModel;", "trailerUseCase", "Lcom/nadi/core/trailer/TrailerUseCase;", "(Lcom/nadi/core/trailer/TrailerUseCase;)V", "_onMessageError", "Landroidx/lifecycle/MutableLiveData;", "", "_property", "Lcom/nadi/core/trailer/Trailer;", "_status", "Lcom/nadi/nadimovies/util/ApiStatus;", "onMessageError", "Landroidx/lifecycle/LiveData;", "getOnMessageError", "()Landroidx/lifecycle/LiveData;", "property", "getProperty", "status", "getStatus", "getMovieTrailer", "", "movieID", "", "app_debug"})
public final class TrailerViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.nadi.nadimovies.util.ApiStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> _onMessageError = null;
    private final androidx.lifecycle.MutableLiveData<com.nadi.core.trailer.Trailer> _property = null;
    private final com.nadi.core.trailer.TrailerUseCase trailerUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.nadimovies.util.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Object> getOnMessageError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nadi.core.trailer.Trailer> getProperty() {
        return null;
    }
    
    public final void getMovieTrailer(int movieID) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public TrailerViewModel(@org.jetbrains.annotations.NotNull()
    com.nadi.core.trailer.TrailerUseCase trailerUseCase) {
        super();
    }
}