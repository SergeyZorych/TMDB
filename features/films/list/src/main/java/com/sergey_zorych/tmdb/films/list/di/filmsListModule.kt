package com.sergey_zorych.tmdb.films.list.di

import androidx.fragment.app.Fragment
import com.sergey_zorych.tmdb.films.list.FilmsListRouter
import com.sergey_zorych.tmdb.films.list.FilmsListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Android Studio on 10/5/21 2:56 PM
 *
 * @author Sergey Zorych
 */
val filmsListModule = module {

    viewModel { FilmsListViewModel(get()) }

    factory { (fragment: Fragment) -> FilmsListRouter(fragment) }
}