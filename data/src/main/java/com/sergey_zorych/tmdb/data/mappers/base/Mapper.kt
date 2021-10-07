package com.sergey_zorych.tmdb.data.mappers.base

/**
 * Created by Android Studio on 7/9/21 2:33 PM
 *
 * Interface to represent the implementation of mapping from data models to domain models.
 *
 * @author Sergey Zorych
 */
interface Mapper<in T, out D> {

    /**
     * @param data object from data layer
     * @return domain object
     */
    fun toDomain(data: T): D
}