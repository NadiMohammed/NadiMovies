//package com.nadi.data.di
//
//import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
//import com.nadi.core.movie.MovieGateway
//import com.nadi.core.similar.SimilarGateway
//import com.nadi.core.trailer.TrailerGateway
//import com.nadi.data.BuildConfig
//import com.nadi.data.repository.MovieRepositoryImplementer
//import com.nadi.data.repository.SimilarRepositoryImplementer
//import com.nadi.data.repository.TrailerRepositoryImplementer
//import com.nadi.data.network.MovieAPIs
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import kotlinx.coroutines.ExperimentalCoroutinesApi
//import okhttp3.Interceptor
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import javax.inject.Named
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//@ExperimentalCoroutinesApi
//object AppModule {
//
//
//    @Singleton
//    @Provides
//    @Named("logging")
//    fun provideLoggingInterceptor(): Interceptor =
//        HttpLoggingInterceptor().apply {
//            level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
//            else HttpLoggingInterceptor.Level.NONE
//        }
//
//    @Singleton
//    @Provides
//    @Named("header")
//    fun provideHeaderInterceptor(): Interceptor =
//        Interceptor { chain ->
//            val request = chain.request()
//            val newUrl = request.url.newBuilder().addQueryParameter("api_key", BuildConfig.API_KEY)
//                .build()
//            val newRequest = request.newBuilder().url(newUrl).method(request.method, request.body)
//                .build()
//            chain.proceed(newRequest)
//        }
//
//    @Singleton
//    @Provides
//    fun provideOkHttpClient(): OkHttpClient =
//        OkHttpClient.Builder()
//            .addInterceptor(provideHeaderInterceptor())
//            .addInterceptor(provideLoggingInterceptor())
//            .addNetworkInterceptor(provideLoggingInterceptor())
//            .build()
//
//    @Singleton
//    @Provides
//    fun provideRetrofitInstance(): Retrofit = Retrofit.Builder()
//        .baseUrl(BuildConfig.BASE_URL)
//        .client(provideOkHttpClient())
//        .addConverterFactory(GsonConverterFactory.create())
//        .addCallAdapterFactory(CoroutineCallAdapterFactory())
//        .build()
//
//    @Singleton
//    @Provides
//    fun provideWebService(retrofit: Retrofit): MovieAPIs = retrofit.create(MovieAPIs::class.java)
//
//    @Singleton
//    @Provides
//    fun provideTestDataGateway(movieAPIs: MovieAPIs): MovieGateway =
//        MovieRepositoryImplementer(movieAPIs)
////    fun provideTestDataGateway(): MovieRepository = MovieRepositoryImplementer()
//
//    @Singleton
//    @Provides
//    fun provideTrailerDataGateway(movieAPIs: MovieAPIs): TrailerGateway =
//        TrailerRepositoryImplementer(movieAPIs)
//
//    @Singleton
//    @Provides
//    fun provideSimilarDataGateway(movieAPIs: MovieAPIs): SimilarGateway =
//        SimilarRepositoryImplementer(movieAPIs)
//
//}