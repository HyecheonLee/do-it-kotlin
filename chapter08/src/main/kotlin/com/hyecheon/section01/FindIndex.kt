package com.hyecheon.section01

fun <T> find(a: Array<T>, Target: T): Int {
    for (i in a.indices) {
        if (a[i] == Target) return i
    }
    return -1
}

fun main() {
    val arr1 = arrayOf("Apple", "Banana", "Cherry", "Durian")
    val arr2 = arrayOf(1, 2, 3, 4)

    println("arr.indices ${arr1.indices}")
    println(find(arr1, "Cherry"))
    println(find(arr2, 2))
}