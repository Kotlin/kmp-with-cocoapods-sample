plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
}

group = "org.jetbrains.kotlin.sample"
version = "1.0-SNAPSHOT"

kotlin {
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Kotlin sample project with CocoaPods dependencies"
        homepage = "https://github.com/Kotlin/kotlin-with-cocoapods-sample"

        ios.deploymentTarget = "16.0"

        /**
         * Example of usage remote Cocoapods dependency from Cocoapods repository
         */
        pod("Base64") {
            version = "~> 1.1.2"
        }

        /**
         * Example of usage remote Pod from Github repository by tag
         */
        pod("SDWebImage") {
            source = git("https://github.com/SDWebImage/SDWebImage.git") {
                tag = "5.21.0"
            }
        }

        /**
         * Example of usage remote Pod from Github repository by branch
         */
        pod("JSONModel") {
            source = git("https://github.com/jsonmodel/jsonmodel.git") {
                branch = "key-mapper-class"
            }
        }

        /**
         * Example of usage remote Pod from Github repository by commit
         */
        pod("AFNetworking") {
            source = git("https://github.com/AFNetworking/AFNetworking.git") {
                commit = "d9f589cc2c1fe9d55eb5eea00558010afea7a41e"
            }
        }

        /**
         * Example of usage local Cocoapods dependency
         */
        pod("pod_dependency") {
            version = "1.0"
            source = path(project.file("../pod_dependency"))
        }

        /**
         * Example of usage local Pod declared as Subspec
         */
        pod("subspec_dependency/Core") {
            version = "1.0"
            source = path(project.file("../subspec_dependency"))
        }

        /**
         * Example of usage Pod from custom spec repository
         * Please, make sure that your existing Podfile contains `source 'path/to/spec-repo.git'` line
         */
//        specRepos {
//            url("https://github.com/Kotlin/kotlin-cocoapods-spec.git")
//        }
//        pod("example")
    }

    sourceSets {
        all {
            languageSettings {
                optIn("kotlinx.cinterop.ExperimentalForeignApi")
            }
        }
    }
}