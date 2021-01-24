package com.nadi.data.gateway;

import com.nadi.core.OperationResult;
import com.nadi.core.movie.Movie;
import com.nadi.core.movie.MovieGateway;
import com.nadi.data.CallbackHandler;
import com.nadi.data.network.MovieAPIs;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import javax.inject.Inject;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/nadi/data/gateway/MovieGatewayImplementer;", "Lcom/nadi/core/movie/MovieGateway;", "Lcom/nadi/data/CallbackHandler;", "movieAPIs", "Lcom/nadi/data/network/MovieAPIs;", "(Lcom/nadi/data/network/MovieAPIs;)V", "getNowPlaying", "Lcom/nadi/core/OperationResult;", "Lcom/nadi/core/movie/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class MovieGatewayImplementer extends com.nadi.data.CallbackHandler implements com.nadi.core.movie.MovieGateway {
    private final com.nadi.data.network.MovieAPIs movieAPIs = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNowPlaying(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nadi.core.OperationResult<com.nadi.core.movie.Movie>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public MovieGatewayImplementer(@org.jetbrains.annotations.NotNull()
    com.nadi.data.network.MovieAPIs movieAPIs) {
        super();
    }
}