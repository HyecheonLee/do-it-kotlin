package com.hyecheon.section03

fun main() {
    val res1 = sum(3, 2)
    val res2 = mul(3, 2)
    println("res1: $res1, res2: $res2")
}

fun sum(x: Int, y: Int) = x + y
fun mul(x: Int, y: Int) = x * y
