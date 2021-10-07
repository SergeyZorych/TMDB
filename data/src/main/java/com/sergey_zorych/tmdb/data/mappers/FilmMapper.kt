package com.sergey_zorych.tmdb.data.mappers

import com.sergey_zorych.tmdb.data.mappers.base.Mapper
import com.sergey_zorych.tmdb.data.responses.FilmResponse
import com.sergey_zorych.tmdb.domain.models.Film

/**
 * Created by Android Studio on 10/3/21 11:28 PM
 *
 * @author Sergey Zorych
 */
internal class FilmMapper : Mapper<FilmResponse, Film> {

    override fun toDomain(data: FilmResponse): Film {
        return Film(
            id = data.id,
            originalTitle = data.originalTitle ?: "",
            overview = data.overview ?: "",
            posterPreviewUrl = posterPreviewUrlPart + data.posterPath,
            posterFullSizeUrl = posterFullSizeUrlPart + data.posterPath,
            voteAverage = data.voteAverage ?: 0.0
        )
    }

    private companion object {
        const val posterPreviewUrlPart = "https://image.tmdb.org/t/p/w500"
        const val posterFullSizeUrlPart = "https://image.tmdb.org/t/p/original"
    }
}