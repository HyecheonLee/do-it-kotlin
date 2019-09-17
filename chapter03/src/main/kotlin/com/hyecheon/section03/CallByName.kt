package com.hyecheon.section03

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}
