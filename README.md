[![official project](http://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)

# kotlin-with-cocoapods-sample
This project represents the case when CocoaPods dependencies added in Kotlin and there is no existing Xcode project

Project contains several directories:
*   `pod_dependency` - local Objective-C library with .podspec file
*   `subspec_dependency` - local Objective-C library whose .podspec file contains **subspec "Core"**
*   `kotlin-library` - Kotlin module with `cocoapods` section containing dependency on both local pods, remote pod `Base64` and remote subspec dependency on `SDWebImage/MapKit` 

Importing of this project to Intellij IDEA provides features like code-completion from these dependencies, 
highlighting and others
