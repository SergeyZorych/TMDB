package com.sergey_zorych.tmdb.films.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.sergey_zorych.tmdb.core.view_model.BaseViewModel
import com.sergey_zorych.tmdb.domain.repositories.FilmsRepository
import com.sergey_zorych.tmdb.films.list.adapter.FilmCell
import kotlinx.coroutines.launch

/**
 * Created by Android Studio on 10/5/21 2:56 PM
 *
 * @author Sergey Zorych
 */
class FilmsListViewModel(
    private val filmsRepository: FilmsRepository
) : BaseViewModel() {

    private val _films = MutableLiveData<List<FilmCell>>()
    val films: LiveData<List<FilmCell>> = _films

    init {
        getFilms()
    }

    private fun getFilms() = viewModelScope.launch {
        val films = filmsRepository.getFilms(1)
        _films.postValue(films.map(FilmCell.Companion::from))
    }
}