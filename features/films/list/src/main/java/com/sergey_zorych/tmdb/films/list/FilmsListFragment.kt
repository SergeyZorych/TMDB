package com.sergey_zorych.tmdb.films.list

import by.kirich1409.viewbindingdelegate.viewBinding
import com.sergey_zorych.tmdb.core.fragment.BaseVMFragment
import com.sergey_zorych.tmdb.core.utils.nonNullObserve
import com.sergey_zorych.tmdb.design_system.item_decorations.OffsetItemDecoration
import com.sergey_zorych.tmdb.films.list.adapter.FilmsAdapter
import com.sergey_zorych.tmdb.films.list.databinding.FragmentFilmsListBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

/**
 * Created by Android Studio on 10/5/21 2:55 PM
 *
 * @author Sergey Zorych
 */
class FilmsListFragment :
    BaseVMFragment<FragmentFilmsListBinding, FilmsListViewModel>(R.layout.fragment_films_list) {

    override val binding: FragmentFilmsListBinding by viewBinding()

    override val viewModel: FilmsListViewModel by viewModel()

    private val router: FilmsListRouter by inject { parametersOf(this) }

    private val adapter: FilmsAdapter by lazy { FilmsAdapter() }

    override fun initView() {
        binding.rvFilms.addItemDecoration(OffsetItemDecoration())
        binding.rvFilms.adapter = adapter
    }

    override fun initListeners() {
        adapter.setOnItemClickListener { cell -> router.toDetails(cell.id) }
    }

    override fun initObservers() {
        viewModel.films.nonNullObserve(viewLifecycleOwner, adapter::submitList)
    }
}