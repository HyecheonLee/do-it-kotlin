package com.hyecheon.section05

fun main() {
    val number = 4
    val result: Long
    result = factorial(number)
    println("Factorial: $number -> $result")
}

fun factorial(n: Int): Long = if (n == 1) n.toLong() else n * (factorial(n - 1))