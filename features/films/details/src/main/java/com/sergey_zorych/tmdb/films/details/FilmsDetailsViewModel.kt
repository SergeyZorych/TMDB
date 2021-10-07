package com.sergey_zorych.tmdb.films.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sergey_zorych.tmdb.core.view_model.BaseViewModel
import com.sergey_zorych.tmdb.domain.models.Film
import com.sergey_zorych.tmdb.domain.repositories.FilmsRepository

/**
 * Created by Android Studio on 10/7/21 12:33 PM
 *
 * @author Sergey Zorych
 */
class FilmsDetailsViewModel(
    private val filmsRepository: FilmsRepository,
    private val filmId: Int
) : BaseViewModel() {

    private val _film = MutableLiveData<Film>()
    val film: LiveData<Film> = _film

    init {
        getFilm()
    }

    private fun getFilm() {
        filmsRepository.getFilm(filmId).await{
            _film.postValue(it)
        }
    }
}