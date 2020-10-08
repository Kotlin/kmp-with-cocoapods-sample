import cocoapods.pod_dependency.*
import cocoapods.SDWebImage.*
import cocoapods.AFNetworking.*
import cocoapods.subspec_dependency.*
import cocoapods.cocoapodSourcesZip.cocoapodSourcesZip
import cocoapods.example.foo as exampleFoo
import cocoapods.CocoaLumberjack.*

fun bar() {
    println(AFNetworkingReachabilityNotificationStatusItem)
    println(cocoapodSourcesZip())
    println(foo())
}

fun bazz() {
    println(SDGraphicsImageRendererFormatRangeAutomatic)
    println(exampleFoo())
    println(baz())
}