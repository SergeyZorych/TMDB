import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = BuildConfig.compileSdkVersion
    buildToolsVersion = BuildConfig.buildToolsVersion

    defaultConfig {
        minSdk = BuildConfig.minSdkVersion
        targetSdk = BuildConfig.targetSdkVersion
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName

        testInstrumentationRunner = TestDeps.androidJunitRunner
    }

    buildTypes {
        val apiKey: String = gradleLocalProperties(rootDir).getProperty("apiKey")

        debug {
            buildConfigField("String", "API_KEY", apiKey)
        }
        release {
            buildConfigField("String", "API_KEY", apiKey)

            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        viewBinding = true
    }
    namespace = "com.sergey_zorych.tmdb"
}

dependencies {
    implementation(project(Modules.Libraries.ResStrings))
    implementation(project(Modules.Libraries.ResDrawables))
    implementation(project(Modules.Libraries.DesignSystem))

    implementation(project(":data"))
    implementation(project(":features:films:list"))
    implementation(project(":features:films:details"))

    implementation(Deps.AppCompat)
    implementation(Deps.Material)
    implementation(Deps.KoinAndroid)
    implementation(Deps.Timber)
    implementation(Deps.RxAndroid)
    implementation(Deps.RxKotlin)
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.5")
}