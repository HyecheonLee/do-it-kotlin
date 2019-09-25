package com.hyecheon.section03

fun main() {
    val capitalCityMap = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)


    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)
}