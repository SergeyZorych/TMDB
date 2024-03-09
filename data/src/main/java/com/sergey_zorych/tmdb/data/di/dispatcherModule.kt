package com.sergey_zorych.tmdb.data.di

import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

/**
 * Created by Android Studio on 03/09/2024 18:59
 *
 * @author Sergey Zorych
 */

val dispatcherModule = module {

    fun provideDispatcher() = Dispatchers.IO

    single { provideDispatcher() }
}