package com.sergey_zorych.tmdb.films.list

import androidx.fragment.app.Fragment
import com.sergey_zorych.tmdb.navigation.Directions
import com.sergey_zorych.tmdb.navigation.base.BaseRouter

/**
 * Created by Android Studio on 10/5/21 2:58 PM
 *
 * @author Sergey Zorych
 */
class FilmsListRouter(
    fragment: Fragment
) : BaseRouter(fragment) {

    fun toDetails(id: Int) = navigate {
        request = Directions.Films.Details.request(
            mapOf(Directions.Films.Details.In.filmId to id.toString())
        )
    }
}