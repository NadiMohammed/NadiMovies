package com.nadi.data;

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nadi/data/RetrofitBuilder;", "", "()V", "authorizationInterceptor", "Lokhttp3/Interceptor;", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "okHttpClient", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "invoke", "data_debug"})
public final class RetrofitBuilder {
    private static okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor;
    private static okhttp3.Interceptor authorizationInterceptor;
    private static okhttp3.OkHttpClient okHttpClient;
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull()
    public static final com.nadi.data.RetrofitBuilder INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit invoke() {
        return null;
    }
    
    private RetrofitBuilder() {
        super();
    }
}