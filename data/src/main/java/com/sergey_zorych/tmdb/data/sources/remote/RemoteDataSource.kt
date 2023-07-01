package com.sergey_zorych.tmdb.data.sources.remote

import com.sergey_zorych.tmdb.data.responses.FilmResponse
import com.sergey_zorych.tmdb.data.responses.ListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by Android Studio on 10/3/21 11:31 PM
 *
 * @author Sergey Zorych
 */
interface RemoteDataSource {

    @GET("discover/movie")
    suspend fun getFilms(
        @Query("page") page: Int
    ): ListResponse<FilmResponse>

    @GET("movie/{id}")
    suspend fun getFilm(
        @Path("id") id: Int
    ): FilmResponse
}