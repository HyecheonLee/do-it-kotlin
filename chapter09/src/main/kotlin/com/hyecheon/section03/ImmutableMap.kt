package com.hyecheon.section03

fun main() {
    val langMap = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    for ((key, value) in langMap) {
        println("key=$key, value=$value")
    }
}