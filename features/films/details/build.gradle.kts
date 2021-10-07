plugins {
    id(Plugins.AndroidModule)
    id(Plugins.SafeArgs)
}

enableViewBinding()

dependencies {
    implementation(project(Modules.Domain))
    implementation(project(Modules.Libraries.Core))
    implementation(project(Modules.Libraries.Navigation))
    implementation(project(Modules.Libraries.DesignSystem))
    implementation(project(Modules.Libraries.ResDrawables))

    implementation(Deps.NavComponent)
    implementation(Deps.Material)
    implementation(Deps.KoinAndroid)
    implementation(Deps.RxAndroid)
    implementation(Deps.ViewBindingDelegate)
    implementation(Deps.Glide)
}