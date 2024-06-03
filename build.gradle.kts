plugins {
    //trick: for the same plugin versions in all sub-modules
    kotlin("multiplatform").version("2.0.0").apply(false)
    kotlin("native.cocoapods").version("2.0.0").apply(false)
}