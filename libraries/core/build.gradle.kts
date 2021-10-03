plugins {
    id(Plugins.AndroidModule)
}

enableViewBinding()

dependencies {
    implementation(Deps.CoreKTX)
    implementation(Deps.AppCompat)
    implementation(Deps.RxKotlin)
    implementation(Deps.RxAndroid)
    implementation(Deps.Timber)
    implementation(Deps.Lifecycle)
}