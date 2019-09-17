package com.hyecheon.section05.TailRecFactorial.kt

fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long = if (n == 1) run.toLong() else (factorial(n - 1, run * n))