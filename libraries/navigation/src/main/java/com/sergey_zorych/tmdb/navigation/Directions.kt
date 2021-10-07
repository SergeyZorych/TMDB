package com.sergey_zorych.tmdb.navigation

import com.sergey_zorych.tmdb.navigation.base.BaseDirection

/**
 * Created by Android Studio on 10/5/21 3:07 PM
 *
 * Represents all possible destinations in application. Direction must implementation [BaseDirection]
 * interface for define correct deeplink uri. Every direction may contains object that define
 * possible "in" and "out" bundle keys.
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