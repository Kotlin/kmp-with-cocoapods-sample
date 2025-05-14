import cocoapods.pod_dependency.*
import cocoapods.SDWebImage.*
import cocoapods.Base64.*
import cocoapods.subspec_dependency.*
import cocoapods.AFNetworking.*

fun bar() {
    println(MF_Base64Codec.base64StringFromData(MF_Base64Codec.dataFromBase64String("S290bGluICsgQ29jb2FQb2RzID0g4pml")))
    println(foo())
    println(AFNetworkingVersionNumber)
}

fun bazz() {
    println(SDGraphicsImageRendererFormatRangeAutomatic)
    println(baz())
}