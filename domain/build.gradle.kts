plugins {
    id(Plugins.AndroidModule)
}

android {
    namespace = "com.sergey_zorych.tmdb.domain"
}

dependencies {
    implementation(Deps.RxKotlin)
}