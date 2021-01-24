package com.nadi.data.di;

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory;
import com.nadi.core.movie.MovieGateway;
import com.nadi.core.similar.SimilarGateway;
import com.nadi.core.trailer.TrailerGateway;
import com.nadi.data.BuildConfig;
import com.nadi.data.gateway.MovieGatewayImplementer;
import com.nadi.data.gateway.SimilarGatewayImplementer;
import com.nadi.data.gateway.TrailerGatewayImplementer;
import com.nadi.data.network.MovieAPIs;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Named;
import javax.inject.Singleton;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/nadi/data/di/AppModule;", "", "()V", "provideHeaderInterceptor", "Lokhttp3/Interceptor;", "provideLoggingInterceptor", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofitInstance", "Lretrofit2/Retrofit;", "provideSimilarDataGateway", "Lcom/nadi/core/similar/SimilarGateway;", "movieAPIs", "Lcom/nadi/data/network/MovieAPIs;", "provideTestDataGateway", "Lcom/nadi/core/movie/MovieGateway;", "provideTrailerDataGateway", "Lcom/nadi/core/trailer/TrailerGateway;", "provideWebService", "retrofit", "data_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.nadi.data.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "logging")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.Interceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "header")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.Interceptor provideHeaderInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofitInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nadi.data.network.MovieAPIs provideWebService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nadi.core.movie.MovieGateway provideTestDataGateway(@org.jetbrains.annotations.NotNull()
    com.nadi.data.network.MovieAPIs movieAPIs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nadi.core.trailer.TrailerGateway provideTrailerDataGateway(@org.jetbrains.annotations.NotNull()
    com.nadi.data.network.MovieAPIs movieAPIs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nadi.core.similar.SimilarGateway provideSimilarDataGateway(@org.jetbrains.annotations.NotNull()
    com.nadi.data.network.MovieAPIs movieAPIs) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}