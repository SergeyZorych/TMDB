/**
 *  Created by Android Studio on 5/5/21 4:17 PM
 *  Developer: Sergey Zorych
 */

object BuildPlugins {

    object Versions {
        const val kotlin = "1.5.31"
        const val buildToolsVersion = "7.0.2"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

