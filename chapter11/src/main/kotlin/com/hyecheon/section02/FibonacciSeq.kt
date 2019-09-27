package com.hyecheon.section02

val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1)
    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main() {
    println(fibonacciSeq.take(8).toList())
    val saved = fibonacciSeq.iterator()
    println("${saved.next()},${saved.next()},${saved.next()}")
}