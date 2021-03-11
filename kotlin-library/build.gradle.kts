plugins {
    kotlin("multiplatform") version "1.4.31"
    kotlin("native.cocoapods") version "1.4.31"
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

//      Example of usage remote Cocoapods dependency from Cocoapods repository
        pod("AFNetworking") {
            version = "~> 4.0.1"
        }

//      Example of usage remote Pod from Github repository by tag
        pod("SDWebImage") {
            source = git("https://github.com/SDWebImage/SDWebImage.git") {
                tag = "5.9.2"
            }
        }

//      Example of usage remote Pod from Github repository by branch
        pod("JSONModel") {
            source = git("https://github.com/jsonmodel/jsonmodel.git") {
                branch = "key-mapper-class"
            }
        }

//      Example of usage remote Pod from Github repository by commit
        pod("CocoaLumberjack") {
            source = git("https://github.com/CocoaLumberjack/CocoaLumberjack.git") {
                commit = "3e7f595e3a459c39b917aacf9856cd2a48c4dbf3"
            }
        }

//      Example of usage local Cocoapods dependency
        pod("pod_dependency") {
            version = "1.0"
            source = path(project.file("../pod_dependency"))
        }

//      Example of usage local Pod declared as Subspec
        pod("subspec_dependency/Core") {
            version = "1.0"
            source = path(project.file("../subspec_dependency"))
        }

//      Example of usage Pod from custom spec repository
//      Please, make sure that your existing Podfile contains `source 'path/to/spec-repo.git'` line
        specRepos {
            url("https://github.com/Kotlin/kotlin-cocoapods-spec.git")
        }
        pod("example")

        // Example of usage cocoapod dependency from URL source
        // Supported archive file formats: zip, tar, tgz, tbz, txz, gzip, tar.gz, tar.bz2, tar.xz, jar
        pod("cocoapodSourcesZip") {
            source = url("https://github.com/Kotlin/kotlin-with-cocoapods-sample/raw/cocoapods-zip/cocoapodSourcesZip.zip")
        }
    }
}