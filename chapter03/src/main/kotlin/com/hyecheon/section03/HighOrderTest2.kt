package com.hyecheon.section03

fun main() {
    var result: Int
    result = highOrder({ x, y -> x + y }, 10, 20)
    println(result)
}

fun highOrder(func: (Int, Int) -> Int, a: Int, b: Int) = func(a, b)
