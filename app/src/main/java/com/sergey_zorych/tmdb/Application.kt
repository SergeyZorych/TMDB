package com.sergey_zorych.tmdb

import android.app.Application
import com.sergey_zorych.tmdb.di.mergedModulesList
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level
import timber.log.Timber

/**
 * Created by Android Studio on 10/3/21 11:57 PM
 *
 * @author Sergey Zorych
 */
class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin()
        startTimber()
    }

    private fun startKoin() {
        org.koin.core.context.startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@Application)
            modules(mergedModulesList)
        }
    }

    private fun startTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}