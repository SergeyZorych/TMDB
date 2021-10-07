import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *  Created by Android Studio on 7/5/21 11:32 PM
 *  Developer: Sergey Zorych
 */

open class AndroidModulePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            applyPlugins()
            applyAndroidConfig()
        }
    }

    private fun Project.applyPlugins() {
        plugins.run {
            apply("com.android.library")
            apply("kotlin-android")
        }
    }

    private fun Project.applyAndroidConfig() {
        android.run {
            compileSdkVersion(BuildConfig.compileSdkVersion)
            buildToolsVersion = BuildConfig.buildToolsVersion

            defaultConfig {
                minSdk = BuildConfig.minSdkVersion
                targetSdk = BuildConfig.targetSdkVersion

                testInstrumentationRunner = TestDeps.androidJunitRunner
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
            }
        }
    }
}