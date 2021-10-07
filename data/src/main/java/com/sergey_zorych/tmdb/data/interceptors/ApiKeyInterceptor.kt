package com.sergey_zorych.tmdb.data.interceptors

import com.sergey_zorych.tmdb.data.api_key.ApiKey
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by Android Studio on 10/5/21 3:35 PM
 *
 * Interceptor that add api key to every HTTP request
 *
 * @author Sergey Zorych
 */
class ApiKeyInterceptor(
    private val apiKey: ApiKey
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val urlWithApiKey = request.url.newBuilder()
            .addQueryParameter("api_key", apiKey.value).build()

        request = request.newBuilder().url(urlWithApiKey).build()

        return chain.proceed(request)
    }
}