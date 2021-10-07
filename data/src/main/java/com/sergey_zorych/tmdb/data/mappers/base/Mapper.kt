package com.sergey_zorych.tmdb.data.mappers.base

/**
 * Created by Android Studio on 7/9/21 2:33 PM
 *
 * @author Sergey Zorych
 */
interface Mapper<in T, out D> {

    fun toDomain(data: T): D
}