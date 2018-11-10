package com.jflavio1.koin

import android.app.Application
import org.koin.android.ext.android.startKoin

/**
 * KoinApp
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
class KoinApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(kModules))
    }

}