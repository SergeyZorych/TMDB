/**
 *  Created by Android Studio on 5/5/21 4:17 PM
 *  Developer: Sergey Zorych
 */

object BuildPlugins {

    object Versions {
        const val kotlin = "1.8.21"
        const val buildToolsVersion = "8.0.2"
        const val safeArgs = "2.5.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val safeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.safeArgs}"
}

