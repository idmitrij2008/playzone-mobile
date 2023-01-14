plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    kotlin("android").apply(false)
    kotlin("multiplatform").apply(false)
}

//buildscript {
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        classpath(Dependencies.Kotlin.gradlePlugin)
//        classpath("com.android.tools.build:gradle:7.2.2")
//    }
//}
//
//allprojects {
//    repositories {
//        google()
//        mavenCentral()
//    }
//}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
