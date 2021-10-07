package com.sergey_zorych.tmdb.films.details.di

import androidx.fragment.app.Fragment
import com.sergey_zorych.tmdb.films.details.FilmsDetailsRouter
import com.sergey_zorych.tmdb.films.details.FilmsDetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Android Studio on 10/7/21 12:34 PM
 *
 * @author Sergey Zorych
 */
val filmsDetailsModule = module {

    viewModel { (filmId: Int) -> FilmsDetailsViewModel(get(), filmId) }

    factory { (fragment: Fragment) -> FilmsDetailsRouter(fragment) }
}