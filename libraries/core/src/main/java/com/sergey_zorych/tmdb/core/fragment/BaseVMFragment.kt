package com.sergey_zorych.tmdb.core.fragment

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding
import com.sergey_zorych.tmdb.core.R
import com.sergey_zorych.tmdb.core.utils.eventObserve
import com.sergey_zorych.tmdb.core.utils.nonNullObserve
import com.sergey_zorych.tmdb.core.view_model.BaseViewModel

/**
 *  Created by Android Studio on 6/28/21 1:11 PM
 *  Developer: Sergey Zorych
 */

abstract class BaseVMFragment<Binding : ViewBinding, ViewModel : BaseViewModel>(
    @LayoutRes layoutId: Int
) : BaseFragment<Binding>(layoutId) {

    protected abstract val viewModel: ViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initBaseObservers()
        initObservers()
    }

    private fun initBaseObservers() {
        viewModel.showMessage.eventObserve(viewLifecycleOwner) {
            showMessage(it)
        }

        viewModel.showMessageRes.eventObserve(viewLifecycleOwner) {
            showMessage(it)
        }

        viewModel.progressEvent.nonNullObserve(viewLifecycleOwner) {
            val progress = view?.findViewById<View>(R.id.base_progress)
            progress?.visibility = it.visibility
        }
    }

    open fun initObservers() {}
}