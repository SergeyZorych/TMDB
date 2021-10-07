package com.sergey_zorych.tmdb.design_system.item_decorations

import android.content.res.Resources
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Android Studio on 8/11/2020 11:09 PM
 *
 * @author Sergey Zorych
 */

class OffsetItemDecoration(
    private val leftInDp: Int,
    private val rightInDp: Int,
    private val topInDp: Int,
    private val bottomInDp: Int
) : RecyclerView.ItemDecoration() {

    constructor(offsetInDp: Int = 10) : this(offsetInDp, offsetInDp, offsetInDp, offsetInDp)

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)

        if (position == -1) {
            outRect.left = dpToPx(leftInDp).toInt()
            outRect.right = dpToPx(rightInDp).toInt()
            outRect.bottom = dpToPx(bottomInDp).toInt()
        } else {
            if (position == 0) {
                outRect.top = dpToPx(topInDp).toInt()
            }

            outRect.left = dpToPx(leftInDp).toInt()
            outRect.right = dpToPx(rightInDp).toInt()
            outRect.bottom = dpToPx(bottomInDp).toInt()
        }
    }

    private fun dpToPx(dp: Int): Float {
        return (dp * Resources.getSystem().displayMetrics.density)
    }
}