plugins {
    id(Plugins.AndroidModule)
}

dependencies {
    implementation(project(Modules.Domain))

    implementation(Deps.RxKotlin)
    implementation(Deps.OkHttp)
    implementation(Deps.Retrofit)
    implementation(Deps.Gson)
    implementation(Deps.KoinAndroid)
}
android {
    namespace = "com.sergey_zorych.tmdb.data"
}
