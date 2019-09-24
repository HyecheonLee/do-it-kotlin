package com.hyecheon.section02

fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }
            .sortedWith(compareByDescending(Comparator<String> { x, y -> y.length - x.length }) { it })
            .map { it.toUpperCase() }
            .forEach { println(it) }
}