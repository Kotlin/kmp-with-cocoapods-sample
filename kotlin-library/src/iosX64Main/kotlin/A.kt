import cocoapods.pod_dependency.*
import cocoapods.SDWebImage.*
import cocoapods.AFNetworking.*
import cocoapods.subspec_dependency.*
import cocoapods.example.foo as exampleFoo
import cocoapods.CocoaLumberjack.*

fun bar() {
    println(AFNetworkingReachabilityNotificationStatusItem)
    println(foo())
    println(CocoaLumberjackVersionNumber)
}

fun bazz() {
    println(SDGraphicsImageRendererFormatRangeAutomatic)
    println(exampleFoo())
    println(baz())
}