package com.hyecheon.section03

fun main() {
    val out: () -> Unit = { println("Hello world!") }
    out()
    val new = out
    new()
}

