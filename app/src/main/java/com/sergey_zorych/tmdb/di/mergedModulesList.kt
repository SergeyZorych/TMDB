package com.sergey_zorych.tmdb.di

import com.sergey_zorych.tmdb.data.di.mappersModule
import com.sergey_zorych.tmdb.data.di.remoteDataSourceModule
import com.sergey_zorych.tmdb.data.di.repositoriesModule

/**
 * Created by Android Studio on 10/3/21 11:59 PM
 *
 * @author Sergey Zorych
 */
val mergedModulesList = remoteDataSourceModule +

        mappersModule +

        repositoriesModule