package com.hyecheon.section03

fun main() {
    val res1 = funcParam(3, 2, ::sum)
    println(res1)

    hello(::text)
    val likeLambda = ::sum
    println(likeLambda(6, 6))
}

fun text(a: String, b: String) = "Hi! $a $b"
fun funcParam(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)
fun hello(func: (String, String) -> String) = println(func("Hello", "World"))