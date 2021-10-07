/**
 *  Created by Android Studio on 5/5/21 8:11 PM
 *  Developer: Sergey Zorych
 */

object TestDeps {

    private object Versions {
        const val junit = "4.13.2"
        const val espresso = "3.3.0"
    }

    const val androidJunitRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val jUnit = "junit:junit:${Versions.junit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}