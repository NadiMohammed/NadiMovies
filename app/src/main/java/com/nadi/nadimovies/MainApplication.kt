package com.nadi.nadimovies

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.ExperimentalCoroutinesApi

@HiltAndroidApp
@ExperimentalCoroutinesApi
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }

}



