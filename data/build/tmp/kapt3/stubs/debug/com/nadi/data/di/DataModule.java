package com.nadi.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/nadi/data/di/DataModule;", "", "()V", "bindMovieRepositoryImplementer", "Lcom/nadi/nadimovies/domain/movie/MovieRepository;", "movieRepositoryImplementer", "Lcom/nadi/data/repository/MovieRepositoryImplementer;", "bindSimilarRepositoryImplementer", "Lcom/nadi/nadimovies/domain/similar/SimilarRepository;", "similarRepositoryImplementer", "Lcom/nadi/data/repository/SimilarRepositoryImplementer;", "bindTrailerRepositoryImplementer", "Lcom/nadi/nadimovies/domain/trailer/TrailerRepository;", "trailerRepositoryImplementer", "Lcom/nadi/data/repository/TrailerRepositoryImplementer;", "data_debug"})
@dagger.Module()
public abstract class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @dagger.Binds()
    public abstract com.nadi.nadimovies.domain.movie.MovieRepository bindMovieRepositoryImplementer(@org.jetbrains.annotations.NotNull()
    com.nadi.data.repository.MovieRepositoryImplementer movieRepositoryImplementer);
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @dagger.Binds()
    public abstract com.nadi.nadimovies.domain.similar.SimilarRepository bindSimilarRepositoryImplementer(@org.jetbrains.annotations.NotNull()
    com.nadi.data.repository.SimilarRepositoryImplementer similarRepositoryImplementer);
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @dagger.Binds()
    public abstract com.nadi.nadimovies.domain.trailer.TrailerRepository bindTrailerRepositoryImplementer(@org.jetbrains.annotations.NotNull()
    com.nadi.data.repository.TrailerRepositoryImplementer trailerRepositoryImplementer);
}