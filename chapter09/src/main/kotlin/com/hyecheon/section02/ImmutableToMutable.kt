package com.hyecheon.section02

fun main() {
    val names = listOf("one", "two", "three")
    val mutableNames = names.toMutableList()
    mutableNames.add("four")
    println(mutableNames)
}