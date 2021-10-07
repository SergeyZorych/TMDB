import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 *  Created by Android Studio on 5/10/21 11:42 PM
 *  Developer: Sergey Zorych
 */

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.api(list: List<String>) {
    list.forEach { dependency ->
        add("api", dependency)
    }
}

fun DependencyHandler.implementation() {}

@Suppress("UnstableApiUsage")
fun Project.enableViewBinding() {
    android.run {
        buildFeatures.run {
            viewBinding = true
        }
    }
}

val Project.android: BaseExtension
    get() = extensions.findByName("android") as? BaseExtension
        ?: error("Project '$name' is not an Android module")

