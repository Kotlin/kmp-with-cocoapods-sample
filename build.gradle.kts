plugins {
    //trick: for the same plugin versions in all sub-modules
    kotlin("multiplatform").version("1.9.20-RC").apply(false)
    kotlin("native.cocoapods").version("1.9.20-RC").apply(false)
}