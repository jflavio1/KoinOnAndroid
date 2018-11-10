package com.jflavio1.koin

import android.app.Application
import com.jflavio1.koin.data.MovieRepositoryImpl
import com.jflavio1.koin.domain.MovieRepository
import com.jflavio1.koin.presentation.genres.presenter.GenresPresenter
import com.jflavio1.koin.presentation.genres.presenter.GenresPresenterImpl
import com.jflavio1.koin.presentation.movies.MoviesViewModel
import org.koin.android.ext.koin.with
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import org.koin.standalone.StandAloneContext.startKoin

/**
 * KoinModules
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
@JvmField
val kModules = module {

    // declaring a singleton component
    single { MovieRepositoryImpl() as MovieRepository }

    // declaring a factory component (it's initialized on every call)
    factory { GenresPresenterImpl() as GenresPresenter }

    // get() will initialize MovieRepositoryImpl
    viewModel { MoviesViewModel(get()) }

}

// for Java
fun start(myApplication: Application) {
    // Start Koin with given Application instance from a Java class
    startKoin(listOf(kModules)) with (myApplication)
}