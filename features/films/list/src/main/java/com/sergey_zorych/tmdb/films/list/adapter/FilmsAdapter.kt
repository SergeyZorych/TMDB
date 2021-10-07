package com.sergey_zorych.tmdb.films.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.sergey_zorych.tmdb.core.recycler_view.BaseListAdapter
import com.sergey_zorych.tmdb.core.recycler_view.BindingHolder
import com.sergey_zorych.tmdb.core.utils.load
import com.sergey_zorych.tmdb.films.list.databinding.ListItemFilmBinding

/**
 * Created by Android Studio on 10/5/21 3:15 PM
 *
 * @author Sergey Zorych
 */
class FilmsAdapter :
    BaseListAdapter<FilmCell, ListItemFilmBinding>(FilmCellDiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BindingHolder<ListItemFilmBinding> {
        return BindingHolder(
            ListItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBind(binding: ListItemFilmBinding, currentItem: FilmCell) {
        binding.title.text = currentItem.title
        binding.overview.text = currentItem.overview
        binding.poster.load(currentItem.posterUrl)
    }
}