package com.sergey_zorych.tmdb.core.utils

import android.widget.ImageView
import com.sergey_zorych.tmdb.core.glide.GlideApp

/**
 * Created by Android Studio on 10/7/21 4:57 PM
 *
 * File that contains all extensions for [Glide]
 *
 * @author Sergey Zorych
 */

/**
 * Load image to [ImageView] by url
 *
 * @param imageUrl url of image for loading
 * @param previewUrl url of preview image
 */
fun ImageView.load(imageUrl: String, previewUrl: String = "") {
    val previewRequest = GlideApp.with(this.context)
        .load(previewUrl)

    GlideApp.with(this.context)
        .load(imageUrl)
        .thumbnail(previewRequest)
        .into(this)
}