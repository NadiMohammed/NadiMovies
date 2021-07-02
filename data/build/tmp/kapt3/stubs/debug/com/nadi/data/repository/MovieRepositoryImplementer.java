package com.nadi.data.repository;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/nadi/data/repository/MovieRepositoryImplementer;", "Lcom/nadi/nadimovies/domain/movie/MovieRepository;", "Lcom/nadi/data/CallbackHandler;", "database", "Lcom/nadi/data/local/MainDatabase;", "movieAPIs", "Lcom/nadi/data/network/MovieAPIs;", "(Lcom/nadi/data/local/MainDatabase;Lcom/nadi/data/network/MovieAPIs;)V", "create", "", "movie", "", "Lcom/nadi/nadimovies/domain/movie/Movie$Result;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlaying", "Lcom/nadi/nadimovies/domain/Result;", "Lcom/nadi/nadimovies/domain/movie/Movie;", "search", "Lcom/nadi/nadimovies/domain/search/Search;", "movieName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class MovieRepositoryImplementer extends com.nadi.data.CallbackHandler implements com.nadi.nadimovies.domain.movie.MovieRepository {
    private final com.nadi.data.local.MainDatabase database = null;
    private final com.nadi.data.network.MovieAPIs movieAPIs = null;
    
    @javax.inject.Inject()
    public MovieRepositoryImplementer(@org.jetbrains.annotations.NotNull()
    com.nadi.data.local.MainDatabase database, @org.jetbrains.annotations.NotNull()
    com.nadi.data.network.MovieAPIs movieAPIs) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNowPlaying(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nadi.nadimovies.domain.Result<com.nadi.nadimovies.domain.movie.Movie>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String movieName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nadi.nadimovies.domain.Result<com.nadi.nadimovies.domain.search.Search>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object create(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nadi.nadimovies.domain.movie.Movie.Result> movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object get(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nadi.nadimovies.domain.movie.Movie.Result>> continuation) {
        return null;
    }
}