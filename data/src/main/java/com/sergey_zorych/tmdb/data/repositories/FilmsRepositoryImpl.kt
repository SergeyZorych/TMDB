package com.sergey_zorych.tmdb.data.repositories

import com.sergey_zorych.tmdb.data.mappers.base.Mapper
import com.sergey_zorych.tmdb.data.responses.FilmResponse
import com.sergey_zorych.tmdb.data.sources.remote.RemoteDataSource
import com.sergey_zorych.tmdb.domain.models.Film
import com.sergey_zorych.tmdb.domain.repositories.FilmsRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

/**
 * Created by Android Studio on 10/3/21 11:26 PM
 *
 * @author Sergey Zorych
 */
class FilmsRepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper<FilmResponse, Film>,
    private val dispatcher: CoroutineDispatcher
) : FilmsRepository {

    override suspend fun getFilms(page: Int): List<Film> = withContext(dispatcher) {
        val response = remoteDataSource.getFilms(page).results ?: emptyList()
        return@withContext response.map(mapper::toDomain)
    }

    override suspend fun getFilm(id: Int): Film = withContext(dispatcher) {
        val response = remoteDataSource.getFilm(id)
        return@withContext mapper.toDomain(response)
    }
}