package com.sergey_zorych.tmdb.di

import com.sergey_zorych.tmdb.data.di.mappersModule
import com.sergey_zorych.tmdb.data.di.remoteDataSourceModule
import com.sergey_zorych.tmdb.data.di.repositoriesModule
import com.sergey_zorych.tmdb.films.details.di.filmsDetailsModule
import com.sergey_zorych.tmdb.films.list.di.filmsListModule

/**
 * Created by Android Studio on 10/3/21 11:59 PM
 *
 * @author Sergey Zorych
 */
val featureModules = filmsListModule +

        filmsDetailsModule

val mergedModulesList = remoteDataSourceModule +

        mappersModule +

        repositoriesModule +

        featureModules +

        apiKeyModule