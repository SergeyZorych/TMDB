package com.sergey_zorych.tmdb.films.details

import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.sergey_zorych.tmdb.core.fragment.BaseVMFragment
import com.sergey_zorych.tmdb.core.utils.load
import com.sergey_zorych.tmdb.core.utils.nonNullObserve
import com.sergey_zorych.tmdb.films.details.databinding.FragmentFilmsDetailsBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

/**
 * Created by Android Studio on 10/7/21 12:33 PM
 *
 * @author Sergey Zorych
 */
internal class FilmsDetailsFragment :
    BaseVMFragment<FragmentFilmsDetailsBinding, FilmsDetailsViewModel>(R.layout.fragment_films_details) {

    override val binding: FragmentFilmsDetailsBinding by viewBinding()

    override val viewModel: FilmsDetailsViewModel by viewModel { parametersOf(filmId) }

    private val router: FilmsDetailsRouter by inject { parametersOf(this) }

    private val filmId: Int by lazy {
        navArgs<FilmsDetailsFragmentArgs>().value.filmId
    }

    override fun initListeners() {
        binding.toolbar.setNavigationOnClickListener {
            router.back()
        }
    }

    override fun initObservers() {
        viewModel.film.nonNullObserve(viewLifecycleOwner) {
            binding.toolbar.title = it.originalTitle
            binding.overview.text = it.overview
            binding.poster.load(it.posterFullSizeUrl, it.posterPreviewUrl)
        }
    }
}