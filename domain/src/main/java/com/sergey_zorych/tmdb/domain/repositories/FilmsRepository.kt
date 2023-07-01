package com.sergey_zorych.tmdb.domain.repositories

import com.sergey_zorych.tmdb.domain.models.Film
import io.reactivex.Single

/**
 * Created by Android Studio on 10/3/21 11:12 PM
 *
 * Interface to represent the implementation of [Film] repository.
 *
 * @author Sergey Zorych
 */
interface FilmsRepository {

    /**
     * Get list of films by page
     * @param page number of page
     * @see Film
     */
    suspend fun getFilms(page: Int): List<Film>

    /**
     * Get film by id
     * @param id unique id of film
     */
    suspend fun getFilm(id: Int): Film
}