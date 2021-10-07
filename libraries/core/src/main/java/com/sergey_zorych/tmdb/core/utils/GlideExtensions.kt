package com.sergey_zorych.tmdb.core.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by Android Studio on 10/7/21 4:57 PM
 *
 * @author Sergey Zorych
 */
fun ImageView.load(imageUrl: String, previewUrl: String = "") {
    val previewRequest = Glide.with(this.context)
        .load(previewUrl)

    Glide.with(this.context)
        .load(imageUrl)
        .thumbnail(previewRequest)
        .into(this)
}