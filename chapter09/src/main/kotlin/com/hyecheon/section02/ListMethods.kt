package com.hyecheon.section02

fun main() {
    val names = listOf("one", "two", "three")
    println(names.size)
    println(names.get(0))
    println(names.indexOf("three"))
    println(names.contains("two"))
}