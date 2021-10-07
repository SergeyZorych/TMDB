package com.sergey_zorych.tmdb.domain.models

/**
 * Created by Android Studio on 10/3/21 11:23 PM
 *
 * @author Sergey Zorych
 */
data class Film(
    val id: Int,
    val originalTitle: String,
    val overview: String,
    val posterPreviewUrl: String,
    val posterFullSizeUrl: String,
    val voteAverage: Double
)