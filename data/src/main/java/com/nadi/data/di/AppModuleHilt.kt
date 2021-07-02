package com.nadi.data.di

import android.content.Context
import androidx.room.Room
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.nadi.data.BuildConfig
import com.nadi.data.local.MainDatabase
import com.nadi.data.local.MoviesDAO
import com.nadi.data.network.MovieAPIs
import com.nadi.data.repository.MovieRepositoryImplementer
import com.nadi.data.repository.SimilarRepositoryImplementer
import com.nadi.data.repository.TrailerRepositoryImplementer
import com.nadi.nadimovies.domain.movie.MovieRepository
import com.nadi.nadimovies.domain.similar.SimilarRepository
import com.nadi.nadimovies.domain.trailer.TrailerRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModuleHilt {

    @Provides
    @Singleton
    fun providesLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    @Singleton
    fun providesInterceptor(): Interceptor =
        Interceptor { chain ->
            chain.proceed(
                chain.request().newBuilder().url(
                    chain.request().url.newBuilder()
                        .addQueryParameter("api_key", BuildConfig.API_KEY)
                        .build()
                ).build()
            )
        }

    @Provides
    @Singleton
    fun providesOkHttpClient(): OkHttpClient =
        OkHttpClient()
            .newBuilder()
            .addInterceptor(providesInterceptor())
            .addInterceptor(providesLoggingInterceptor())
            .build()

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(providesOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()

    @Provides
    @Singleton
    fun providesMovieAPIs(retrofit: Retrofit): MovieAPIs = retrofit.create(MovieAPIs::class.java)


    @Provides
    @Singleton
    fun providesAppDatabase(@ApplicationContext context: Context): MainDatabase =
        Room.databaseBuilder(context, MainDatabase::class.java, "MainDatabase")
            .fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun providesCurrentWeatherDao(db: MainDatabase): MoviesDAO = db.moviesDAO

}

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @ExperimentalCoroutinesApi
    @Binds
    abstract fun bindMovieRepositoryImplementer(movieRepositoryImplementer: MovieRepositoryImplementer): MovieRepository

    @ExperimentalCoroutinesApi
    @Binds
    abstract fun bindSimilarRepositoryImplementer(similarRepositoryImplementer: SimilarRepositoryImplementer): SimilarRepository

    @ExperimentalCoroutinesApi
    @Binds
    abstract fun bindTrailerRepositoryImplementer(trailerRepositoryImplementer: TrailerRepositoryImplementer): TrailerRepository
}
