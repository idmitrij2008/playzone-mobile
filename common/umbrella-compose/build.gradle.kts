plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))
                implementation(project(":common:coreCompose"))
                implementation(project(":common:coreUtils"))

                implementation(project(":common:auth:data"))
                implementation(project(":common:auth:compose"))
                implementation(project(":common:games:data"))
                implementation(project(":common:tournaments:data"))
                api(project(":common:umbrella-core"))

                implementation(Dependencies.Other.ViewModel.core)
                implementation(Dependencies.Other.ViewModel.compose)
                implementation(Dependencies.Other.ViewModel.odissey)

                implementation(Dependencies.Other.Navigation.compose)
                implementation(Dependencies.Other.Navigation.core)
            }
        }

        androidMain {
            dependencies {
                implementation(project(":common:coreCompose"))
                implementation(Dependencies.Android.composeActivity)
            }
        }
    }
}