package com.hyecheon.section04

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")


    list.forEach { print("$it ") }
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value") }

    val returnedList = list.onEach { println(it) }
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")

    println(list.count { i -> i % 2 == 0 })

    println(list.max())
    println(list.min())

    println("maxBy: ${map.maxBy { it.key }}")
    println("minBy: ${map.minBy { it.key }}")

    println(list.fold(4) { acc: Int, value: Int -> acc + value })
    println(list.fold(1) { acc: Int, value: Int -> acc * value })

    println(list.foldRight(4) { i: Int, acc: Int -> acc + i })
    println(list.foldRight(1) { i: Int, acc: Int -> acc * i })

    println(list.reduce { acc, i -> acc + i })
    println(list.reduceRight { acc, i -> acc + i })

    println(listPair.sumBy { pair -> pair.second })
}