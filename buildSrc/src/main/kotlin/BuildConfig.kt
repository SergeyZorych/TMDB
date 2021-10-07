/**
 *  Created by Android Studio on 5/5/21 8:07 PM
 *  Developer: Sergey Zorych
 */

object BuildConfig {
    private const val major = 1
    private const val minor = 0
    private const val patch = 0

    const val buildToolsVersion = "30.0.3"
    const val compileSdkVersion = 30

    const val targetSdkVersion = 30
    const val minSdkVersion = 24
    const val versionCode = 10000 * major + 100 * minor + patch
    const val versionName = "$major.$minor.$patch"
}