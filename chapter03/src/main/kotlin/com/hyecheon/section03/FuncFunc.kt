package com.hyecheon.section03.funcfunc

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum(x: Int, y: Int) = x + y
fun funcFunc(): Int = sum(2, 2)