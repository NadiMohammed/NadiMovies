package com.nadi.data.repository;

import com.nadi.data.CallbackHandler;
import com.nadi.data.RetrofitBuilder;
import com.nadi.data.network.MovieAPIs;
import com.nadi.nadimovies.domain.OperationResult;
import com.nadi.nadimovies.domain.movie.Movie;
import com.nadi.nadimovies.domain.similar.SimilarRepository;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/nadi/data/repository/SimilarRepositoryImplementer;", "Lcom/nadi/nadimovies/domain/similar/SimilarRepository;", "Lcom/nadi/data/CallbackHandler;", "movieAPIs", "Lcom/nadi/data/network/MovieAPIs;", "(Lcom/nadi/data/network/MovieAPIs;)V", "getSimilar", "Lcom/nadi/nadimovies/domain/OperationResult;", "Lcom/nadi/nadimovies/domain/movie/Movie;", "movieID", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class SimilarRepositoryImplementer extends com.nadi.data.CallbackHandler implements com.nadi.nadimovies.domain.similar.SimilarRepository {
    private final com.nadi.data.network.MovieAPIs movieAPIs = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSimilar(int movieID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nadi.nadimovies.domain.OperationResult<com.nadi.nadimovies.domain.movie.Movie>> p1) {
        return null;
    }
    
    public SimilarRepositoryImplementer(@org.jetbrains.annotations.NotNull()
    com.nadi.data.network.MovieAPIs movieAPIs) {
        super();
    }
    
    public SimilarRepositoryImplementer() {
        super();
    }
}