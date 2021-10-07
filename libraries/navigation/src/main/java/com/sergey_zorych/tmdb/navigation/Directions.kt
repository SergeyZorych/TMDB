package com.sergey_zorych.tmdb.navigation

import com.sergey_zorych.tmdb.navigation.base.BaseDirection

/**
 * Created by Android Studio on 10/5/21 3:07 PM
 *
 * @author Sergey Zorych
 */
object Directions {

    object Films {

        object Details : BaseDirection("details") {
            object In {
                const val filmId = "filmId"
            }
        }
    }
}