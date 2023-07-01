import org.gradle.kotlin.dsl.`kotlin-dsl`
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("android-module-plugin") {
            id = "android-module-plugin"
            implementationClass = "AndroidModulePlugin"
        }
    }
}

buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
    }
}

repositories {
    mavenCentral()
    google()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    languageVersion = "1.8"
}

dependencies {
    implementation("com.android.tools.build:gradle:8.0.2")
    implementation("com.android.tools.build:gradle-api:8.0.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.21")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
}