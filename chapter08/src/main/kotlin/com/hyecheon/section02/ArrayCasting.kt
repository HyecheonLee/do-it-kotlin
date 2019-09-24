package com.hyecheon.section02

fun main() {
    val b = Array<Any>(10) { i -> i + 1 }
    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])
}