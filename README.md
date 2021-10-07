# TMDB Application with Clean Architecture

## **Current Stack**

### Kotlin

Whole project written in Kotlin.

[Kotlin docs | Kotlin](https://kotlinlang.org/docs/home.html)

### MVVM

Architecture pattern in presentation layer (features modules)

[](https://developer.android.com/jetpack/guide?gclid=CjwKCAjwtdeFBhBAEiwAKOIy50TjRzAeb73n0bcAYvmrDgJ0-umR-srP69RQVqPyR97T9IU_uV6nIxoCV8wQAvD_BwE&gclsrc=aw.ds)

### Clean Architecture

Use "Clean architecture" for creation three independent layer: data, domain, presentation

[Detailed Guide on Android Clean Architecture](https://medium.com/android-dev-hacks/detailed-guide-on-android-clean-architecture-9eab262a9011)

### Navigation Component

Library from Android Jetpack for navigation

[](https://developer.android.com/guide/navigation)

### RxKotlin

Library for asynchronous operation

[ReactiveX/RxKotlin](https://github.com/ReactiveX/RxKotlin)

### ViewBinding

Generate binding classes for interacts with views

[](https://developer.android.com/topic/libraries/view-binding)

### Koin

Service locator for dependency injection

[Koin - The Kotlin Injection Framework | Koin](https://insert-koin.io/)

### Material

Library with material components

[Material Design](https://material.io/)

### Gradle Kotlin DSL with buildSrc

All gradle files written in Kotlin DSL
buildSrc used for creation gradle plugin with common options and store common dependencies

[](https://docs.gradle.org/current/userguide/kotlin_dsl.html)

## How to start

Add your api key in local.properties in the following format:

```kotlin
apiKey="your api key"
```

And run debug or release build