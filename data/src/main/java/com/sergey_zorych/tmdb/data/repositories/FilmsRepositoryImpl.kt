package com.sergey_zorych.tmdb.data.repositories

import com.sergey_zorych.tmdb.data.mappers.base.Mapper
import com.sergey_zorych.tmdb.data.responses.FilmResponse
import com.sergey_zorych.tmdb.data.sources.remote.RemoteDataSource
import com.sergey_zorych.tmdb.domain.models.Film
import com.sergey_zorych.tmdb.domain.repositories.FilmsRepository
import io.reactivex.Single

/**
 * Created by Android Studio on 10/3/21 11:26 PM
 *
 * @author Sergey Zorych
 */
class FilmsRepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper<FilmResponse, Film>
) : FilmsRepository {

    override fun getFilms(page: Int): Single<List<Film>> {
        return remoteDataSource.getFilms(page)
            .map { listResponse -> listResponse.results?.map(mapper::toDomain) }
    }

    override fun getFilm(id: Int): Single<Film> {
        return remoteDataSource.getFilm(id)
            .map(mapper::toDomain)
    }
}