plugins {
    kotlin("multiplatform") version "1.5.255-SNAPSHOT"
    kotlin("native.cocoapods") version "1.5.255-SNAPSHOT"
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
    macosX64()

    cocoapods {
        summary = "Kotlin sample project with CocoaPods dependencies"
        homepage = "https://github.com/Kotlin/kotlin-with-cocoapods-sample"

        ios.deploymentTarget = "13.5"
        osx.deploymentTarget = "10.15"

//      In common scope and will be expanded to all existing platforms
        pod("AFNetworking") {
            version = "~> 4.0.1"
        }

        // Only iOS compatible dependency
        ios.pod("KIF") {
            version = "3.7.15"
        }

        // Only OSX compatible dependency
        osx.pod("ORSSerialPort") {
            source = git("https://github.com/armadsen/ORSSerialPort.git") {
                tag = "2.1.0"
            }
        }
    }
}