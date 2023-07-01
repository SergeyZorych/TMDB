plugins {
    id(Plugins.AndroidModule)
}

enableViewBinding()

dependencies {
    implementation(project(Modules.Domain))
    implementation(project(Modules.Libraries.Core))
    implementation(project(Modules.Libraries.Navigation))
    implementation(project(Modules.Libraries.DesignSystem))
    implementation(project(Modules.Libraries.ResStrings))
    implementation(project(Modules.Libraries.ResDrawables))


    implementation(Deps.NavComponent)
    implementation(Deps.Material)
    implementation(Deps.KoinAndroid)
    implementation(Deps.ViewBindingDelegate)
    implementation(Deps.RxAndroid)
    implementation(Deps.Glide)
}
android {
    namespace = "com.sergey_zorych.tmdb.films.list"
}
