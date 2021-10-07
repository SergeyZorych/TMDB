/**
 *  Created by Android Studio on 5/10/21 4:34 PM
 *  Developer: Sergey Zorych
 */

object Deps {

    private object Versions {

        const val stdLib = "1.5.21"

        const val appCompat = "1.2.0"

        const val coreKTX = "1.3.2"

        const val fragmentKTX = "1.3.3"

        const val activityKTX = "1.3.0-alpha07"

        const val material = "1.4.0"

        const val constraint = "2.1.0"

        const val lifecycle = "2.3.0"

        const val navigation = "2.3.3"

        const val okHttp = "4.9.0"

        const val retrofit = "2.9.0"

        const val gson = "2.8.6"

        const val timber = "4.7.1"

        const val rxKotlin = "2.4.0"

        const val rxAndroid = "2.1.1"

        const val datastore = "1.0.0-alpha06"

        const val koin = "3.1.2"

        const val viewBindingDelegate = "1.4.6"

        const val glide = "4.12.0"
    }

    const val StdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.stdLib}"

    const val AppCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    const val CoreKTX = "androidx.core:core-ktx:${Versions.coreKTX}"

    const val FragmentKTX = "androidx.fragment:fragment-ktx:${Versions.fragmentKTX}"

    const val ActivityKTX = "androidx.activity:activity-ktx:${Versions.activityKTX}"

    const val Material = "com.google.android.material:material:${Versions.material}"

    const val Constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"

    val NavComponent = listOf(
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}",
        "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    )

    val Lifecycle = listOf(
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}",
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}",
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"
    )

    val OkHttp = listOf(
        "com.squareup.okhttp3:okhttp:${Versions.okHttp}",
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    )

    val Retrofit = listOf(
        "com.squareup.retrofit2:retrofit:${Versions.retrofit}",
        "com.squareup.retrofit2:converter-gson:${Versions.retrofit}",
        "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    )

    const val Gson = "com.google.code.gson:gson:${Versions.gson}"

    const val Timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val RxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"

    const val RxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

    const val DataStore = "androidx.datastore:datastore-preferences:${Versions.datastore}"

    const val KoinCore = "io.insert-koin:koin-core:${Versions.koin}"
    const val KoinAndroid = "io.insert-koin:koin-android:${Versions.koin}"

    const val Glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val GlideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val ViewBindingDelegate =
        "com.github.kirich1409:viewbindingpropertydelegate:${Versions.viewBindingDelegate}"
}