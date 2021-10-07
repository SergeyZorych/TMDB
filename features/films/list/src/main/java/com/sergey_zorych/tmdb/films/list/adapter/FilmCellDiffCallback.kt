package com.sergey_zorych.tmdb.films.list.adapter

import androidx.recyclerview.widget.DiffUtil

/**
 * Created by Android Studio on 10/5/21 3:26 PM
 *
 * @author Sergey Zorych
 */
class FilmCellDiffCallback : DiffUtil.ItemCallback<FilmCell>() {
    override fun areItemsTheSame(oldItem: FilmCell, newItem: FilmCell): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: FilmCell, newItem: FilmCell): Boolean {
        return oldItem == newItem
    }
}