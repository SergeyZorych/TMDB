package com.sergey_zorych.tmdb.navigation.base

import android.net.Uri
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest

/**
 * Base class for every direction, that include correct navigation request and request code
 */
abstract class BaseDirection(
    private val name: String
) {
    /**
     * @return request code for direction that must using in setFragmentResultListener
     */
    val requestCode: String = buildRequestCode(name)

    /**
     * @return navigation request without params
     */
    fun request(): NavDeepLinkRequest {
        return NavDeepLinkRequest.Builder
            .fromUri(buildDeeplink(name))
            .build()
    }

    /**
     * @param params query params in navigation request
     * @return navigation request with query params
     */
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