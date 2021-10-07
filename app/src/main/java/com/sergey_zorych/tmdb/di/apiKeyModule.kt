package com.sergey_zorych.tmdb.di

import com.sergey_zorych.tmdb.BuildConfig
import com.sergey_zorych.tmdb.data.api_key.ApiKey
import org.koin.dsl.module

/**
 * Created by Android Studio on 10/7/21 5:37 PM
 *
 * @author Sergey Zorych
 */
val apiKeyModule = module {
    fun provideApiKey(): ApiKey {
        return ApiKey(BuildConfig.API_KEY)
    }

    single { provideApiKey() }
}