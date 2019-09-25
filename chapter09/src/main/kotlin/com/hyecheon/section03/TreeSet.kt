package com.hyecheon.section03

fun main() {
    val intsSortedSet = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = ${intsSortedSet}")

    intsSortedSet.clear()
    println("intsSortedSet = ${intsSortedSet}")
}