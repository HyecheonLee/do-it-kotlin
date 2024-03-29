package com.hyecheon.section02

import java.util.*

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${Arrays.toString(arr)}")
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")

    println(arr.get(2))
    println(arr[2])

    arr.set(2, 7)
    arr[0] = 8

    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")
    for ((i, value) in arr.withIndex()) {
        println("arr[$i] = ${value}")
    }
}