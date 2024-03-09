package com.sergey_zorych.tmdb.data.di

import com.sergey_zorych.tmdb.data.repositories.FilmsRepositoryImpl
import com.sergey_zorych.tmdb.domain.repositories.FilmsRepository
import org.koin.dsl.module

/**
 * Created by Android Studio on 10/3/21 11:54 PM
 *
 * @author Sergey Zorych
 */
val repositoriesModule = module {

    single<FilmsRepository> { FilmsRepositoryImpl(get(), get(), get()) }
}