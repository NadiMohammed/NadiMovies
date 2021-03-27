package com.nadi.data

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private lateinit var httpLoggingInterceptor: HttpLoggingInterceptor

    private lateinit var authorizationInterceptor: Interceptor

    private lateinit var okHttpClient: OkHttpClient

    private lateinit var retrofit: Retrofit

    operator fun invoke(): Retrofit {

        if (!RetrofitBuilder::retrofit.isInitialized) {

            synchronized(this) {

                if (!RetrofitBuilder::retrofit.isInitialized) {

                    httpLoggingInterceptor = HttpLoggingInterceptor()

                    when (BuildConfig.DEBUG) {

                        true -> httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

                        false -> httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE

                    }

                    authorizationInterceptor = Interceptor { chain ->
                        chain.proceed(
                            chain.request().newBuilder().url(
                                chain.request().url.newBuilder()
                                    .addQueryParameter("api_key", BuildConfig.API_KEY)
                                    .build()
                            ).build()
                        )
                    }

                    okHttpClient = OkHttpClient()
                        .newBuilder()
                        .addInterceptor(authorizationInterceptor)
                        .addInterceptor(httpLoggingInterceptor)
                        .build()

                    retrofit = Retrofit.Builder()
                        .baseUrl(BuildConfig.BASE_URL)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(CoroutineCallAdapterFactory())
                        .build()
                }
            }
        }
        return retrofit
    }
}
