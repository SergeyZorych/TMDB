dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}
rootProject.name = "TMDB"
include(":app")
include(":domain")
include(":data")
include(":libraries:core")
include(":libraries:navigation")
include(":libraries:design_system")
include(":libraries:res:strings")
include(":libraries:res:drawables")
include(":features:films:list")
include(":features:films:details")
