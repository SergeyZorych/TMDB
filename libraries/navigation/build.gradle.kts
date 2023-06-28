plugins {
    id(Plugins.AndroidModule)
}

dependencies {
    implementation(Deps.NavComponent)
    implementation(Deps.FragmentKTX)
}
android {
    namespace = "com.sergey_zorych.tmdb.navigation"
}
