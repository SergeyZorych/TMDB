plugins {
    id(Plugins.AndroidModule)
    id(Plugins.Kapt)
}

enableViewBinding()

dependencies {
    implementation(Deps.CoreKTX)
    implementation(Deps.AppCompat)
    implementation(Deps.RxKotlin)
    implementation(Deps.RxAndroid)
    implementation(Deps.Timber)
    implementation(Deps.Lifecycle)
    implementation(Deps.Material)
    implementation(Deps.Glide)
    kapt(Deps.GlideCompiler)
}