package com.nadi.nadimovies

import android.app.Application
import com.nadi.data.repository.MovieRepositoryImplementer
import com.nadi.data.repository.SimilarRepositoryImplementer
import com.nadi.data.repository.TrailerRepositoryImplementer
import com.nadi.nadimovies.domain.DomainDependencies
import kotlinx.coroutines.ExperimentalCoroutinesApi

//@HiltAndroidApp
@ExperimentalCoroutinesApi
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        injectDomainModuleDependencies()
    }

    private fun injectDomainModuleDependencies() {
        with(DomainDependencies) {
            injectMovieRepository(MovieRepositoryImplementer())
            injectSimilarRepository(SimilarRepositoryImplementer())
            injectTrailerRepository(TrailerRepositoryImplementer())
        }
    }
}



