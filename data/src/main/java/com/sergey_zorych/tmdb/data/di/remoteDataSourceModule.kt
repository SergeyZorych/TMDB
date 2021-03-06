package com.sergey_zorych.tmdb.data.di

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.sergey_zorych.tmdb.data.api_key.ApiKey
import com.sergey_zorych.tmdb.data.interceptors.ApiKeyInterceptor
import com.sergey_zorych.tmdb.data.sources.remote.RemoteDataSource
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by Android Studio on 10/3/21 11:40 PM
 *
 * @author Sergey Zorych
 */
val remoteDataSourceModule = module {

    fun provideApiKeyInterceptor(apiKey: ApiKey): ApiKeyInterceptor {
        return ApiKeyInterceptor(apiKey)
    }

    fun provideHttpClient(apiKeyInterceptor: ApiKeyInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .addInterceptor(apiKeyInterceptor)
            .readTimeout(120, TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)
            .connectTimeout(120, TimeUnit.SECONDS)
            .build()
    }

    fun provideGson(): Gson {
        return GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()
    }

    fun provideConverterFactory(gson: Gson): Converter.Factory {
        return GsonConverterFactory.create(gson)
    }

    fun provideCallFactory(): CallAdapter.Factory {
        return RxJava2CallAdapterFactory.create()
    }

    fun provideRetrofit(
        httpClient: OkHttpClient,
        callAdapterFactory: CallAdapter.Factory,
        converterFactory: Converter.Factory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .client(httpClient)
            .addCallAdapterFactory(callAdapterFactory)
            .addConverterFactory(converterFactory)
            .build()
    }

    fun provideRemoteDataSource(retrofit: Retrofit): RemoteDataSource {
        return retrofit.create(RemoteDataSource::class.java)
    }

    single { provideApiKeyInterceptor(get()) }
    single { provideHttpClient(get()) }
    single { provideGson() }
    single { provideConverterFactory(get()) }
    single { provideCallFactory() }
    single { provideRetrofit(get(), get(), get()) }
    single { provideRemoteDataSource(get()) }
}