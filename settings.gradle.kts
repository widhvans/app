// Yeh settings file hai
// Ise root folder me rakhein (jaise /settings.gradle.kts)
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
// Aapke project ka naam
rootProject.name = "testbyakash"
// 'app' module ko include karta hai
include(":app")
