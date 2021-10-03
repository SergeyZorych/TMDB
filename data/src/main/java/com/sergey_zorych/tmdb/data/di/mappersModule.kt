package com.sergey_zorych.tmdb.data.di

import com.sergey_zorych.tmdb.data.mappers.FilmMapper
import com.sergey_zorych.tmdb.data.mappers.base.Mapper
import com.sergey_zorych.tmdb.data.responses.FilmResponse
import com.sergey_zorych.tmdb.domain.models.Film
import org.koin.dsl.module

/**
 * Created by Android Studio on 10/3/21 11:53 PM
 *
 * @author Sergey Zorych
 */
val mappersModule = module {

    single<Mapper<FilmResponse, Film>> { FilmMapper() }
}