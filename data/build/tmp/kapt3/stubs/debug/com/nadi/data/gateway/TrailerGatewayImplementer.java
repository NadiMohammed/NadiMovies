package com.nadi.data.gateway;

import com.nadi.core.OperationResult;
import com.nadi.core.trailer.Trailer;
import com.nadi.core.trailer.TrailerGateway;
import com.nadi.data.CallbackHandler;
import com.nadi.data.network.MovieAPIs;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import javax.inject.Inject;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/nadi/data/gateway/TrailerGatewayImplementer;", "Lcom/nadi/core/trailer/TrailerGateway;", "Lcom/nadi/data/CallbackHandler;", "movieAPIs", "Lcom/nadi/data/network/MovieAPIs;", "(Lcom/nadi/data/network/MovieAPIs;)V", "getTrailer", "Lcom/nadi/core/OperationResult;", "Lcom/nadi/core/trailer/Trailer;", "movieID", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class TrailerGatewayImplementer extends com.nadi.data.CallbackHandler implements com.nadi.core.trailer.TrailerGateway {
    private final com.nadi.data.network.MovieAPIs movieAPIs = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTrailer(int movieID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nadi.core.OperationResult<com.nadi.core.trailer.Trailer>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public TrailerGatewayImplementer(@org.jetbrains.annotations.NotNull()
    com.nadi.data.network.MovieAPIs movieAPIs) {
        super();
    }
}