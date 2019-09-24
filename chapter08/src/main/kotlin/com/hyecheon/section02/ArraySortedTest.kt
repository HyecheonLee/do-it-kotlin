package com.hyecheon.section02

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNums = arr.sortedArray()
    println("ASC: ${sortedNums.contentToString()}")

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DEC: ${sortedNumsDesc.contentToString()}")

    arr.sort(1, 3)
    println("ORI: ${arr.contentToString()}")
    arr.sortDescending()
    println("ORI: ${arr.contentToString()}")

    val listSorted = arr.sorted()
    val listDesc = arr.sortedDescending()
    println("LST: $listSorted")
    println("LST: $listDesc")

    val items = arrayOf("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(items.contentToString())
}