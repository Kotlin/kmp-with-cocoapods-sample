plugins {
    kotlin("multiplatform") version "1.4.255-SNAPSHOT"
    kotlin("native.cocoapods") version "1.4.255-SNAPSHOT"
}

group = "org.jetbrains.kotlin.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    jcenter()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlinx.html/") }
}

kotlin {
    ios()

    cocoapods {
        summary = "Kotlin sample project with CocoaPods dependencies"
        homepage = "https://github.com/Kotlin/kotlin-with-cocoapods-sample"

        ios.deploymentTarget = "13.5"

        //Example of usage remote Cocoapods dependency from Cocoapods repository
        pod("AFNetworking", "~> 4.0.0")

        //Example of usage remote Pod declared as Subspec
        pod("SDWebImage/MapKit")

        //Example of usage local Cocoapods dependency
        pod("pod_dependency", "1.0", project.file("../pod_dependency/pod_dependency.podspec"))

        //Example of usage local Pod declared as Subspec
        pod("subspec_dependency/Core", "1.0", project.file("../subspec_dependency/subspec_dependency.podspec"))

    }
}