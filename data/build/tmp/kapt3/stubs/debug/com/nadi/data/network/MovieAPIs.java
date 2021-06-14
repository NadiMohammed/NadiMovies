package com.nadi.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/nadi/data/network/MovieAPIs;", "", "getNowPlayingMovies", "Lretrofit2/Response;", "Lcom/nadi/nadimovies/domain/movie/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSimilar", "movieID", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrailers", "Lcom/nadi/nadimovies/domain/trailer/Trailer;", "search", "Lcom/nadi/nadimovies/domain/search/Search;", "movieName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface MovieAPIs {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/now_playing")
    public abstract java.lang.Object getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.nadi.nadimovies.domain.movie.Movie>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{MOVIE_ID}/videos")
    public abstract java.lang.Object getTrailers(@retrofit2.http.Path(value = "MOVIE_ID")
    int movieID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.nadi.nadimovies.domain.trailer.Trailer>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{MOVIE_ID}/similar")
    public abstract java.lang.Object getSimilar(@retrofit2.http.Path(value = "MOVIE_ID")
    int movieID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.nadi.nadimovies.domain.movie.Movie>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/movie")
    public abstract java.lang.Object search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String movieName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.nadi.nadimovies.domain.search.Search>> p1);
}