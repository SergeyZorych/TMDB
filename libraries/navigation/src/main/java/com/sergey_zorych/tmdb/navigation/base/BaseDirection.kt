package com.sergey_zorych.tmdb.navigation.base

import android.net.Uri
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest

abstract class BaseDirection(
    private val name: String
) {

    val requestCode: String = buildRequestCode(name)

    fun request(): NavDeepLinkRequest {
        return NavDeepLinkRequest.Builder
            .fromUri(buildDeeplink(name))
            .build()
    }

    fun request(params: Map<String, String?>): NavDeepLinkRequest {
        val uriBuilder = buildDeeplink(name).buildUpon()

        params.forEach {
            uriBuilder.appendQueryParameter(it.key, it.value)
        }

        return NavDeepLinkRequest.Builder
            .fromUri(uriBuilder.build())
            .build()
    }

    private fun buildRequestCode(name: String) =
        "${name}_request_code"

    private fun buildDeeplink(name: String): Uri =
        "android-app://com.sergey_zorych.tmdb/$name".toUri()
}