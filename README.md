# kotlin-with-cocoapods-sample
This project represents the case when Cocoapods dependencies added in Kotlin and there is no existing Xcode project

Project contains several directories:
*   `pod_dependency` - local Objective-C library with .podspec file
*   `subspec_dependency` - local Objective-C library whose .podspec file contains **subspec "Core"**
*   `kotlin-library` - Kotlin module with `cocoapods` section containing dependency on both local pods, remote 
Cocoapod `AFNetworking` and remote subspec dependency on `SDWebImage/MapKit` 

Importing of this project to IDEA provides features like code-completion from these dependencies, 
highlighting and others.

`iosArm64Main` source-set folder is symlinked from `iosX64Main`