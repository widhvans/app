// Yeh project-level build file hai
// Ise root folder me rakhein (jaise /build.gradle.kts)
plugins {
    // Application plugin ko 'com.android.application' se link karta hai
    alias(libs.plugins.android.application) apply false
    // Kotlin plugin ko 'org.jetbrains.kotlin.android' se link karta hai
    alias(libs.plugins.kotlin.android) apply false
}
