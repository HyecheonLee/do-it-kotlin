package com.hyecheon.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str11: $str1 length: ${str1?.length ?: -1}")
}