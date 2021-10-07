package com.sergey_zorych.tmdb.films.list.adapter

import com.sergey_zorych.tmdb.domain.models.Film

/**
 * Created by Android Studio on 10/5/21 3:16 PM
 *
 * @author Sergey Zorych
 */
data class FilmCell(
    val id: Int,
    val title: String,
    val overview: String,
    val posterUrl: String,
    val voteAverage: String
) {
    companion object {
        fun from(domain: Film): FilmCell {
            return FilmCell(
                id = domain.id,
                title = domain.originalTitle,
                overview = domain.overview,
                posterUrl = domain.posterPreviewUrl,
                voteAverage = domain.voteAverage.toString()
            )
        }
    }
}