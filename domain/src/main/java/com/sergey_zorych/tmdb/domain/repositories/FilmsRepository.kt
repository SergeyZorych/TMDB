package com.sergey_zorych.tmdb.domain.repositories

import com.sergey_zorych.tmdb.domain.models.Film
import io.reactivex.Single

/**
 * Created by Android Studio on 10/3/21 11:12 PM
 *
 * @author Sergey Zorych
 */
interface FilmsRepository {

    fun getFilms(page: Int): Single<List<Film>>

    fun getFilm(id: Int): Single<Film>
}