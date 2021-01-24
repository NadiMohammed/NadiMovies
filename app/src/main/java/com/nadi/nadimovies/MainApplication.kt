package com.nadi.nadimovies

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application() {
//    override fun onCreate() {
//        super.onCreate()
//
//        injectCoreModuleDependencies()
////        CoreDependencies.injectMovieGateway(MovieGatewayImplementer())
////        CoreDependencies.injectTrailerGateway(TrailerGatewayImplementer())
//
//    }
//
//    private fun injectCoreModuleDependencies() {
//        with(CoreDependencies) {
//            injectMovieGateway(MovieGatewayImplementer())
//            injectTrailerGateway(TrailerGatewayImplementer())
//        }
//    }
}



