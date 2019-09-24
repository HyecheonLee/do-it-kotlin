package com.hyecheon.section02.sortwith

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
            Product("Snow Ball", 870.00),
            Product("Smart Phone", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 333.55),
            Product("Keyboard", 125.99),
            Product("Monitor", 1500.00),
            Product("Tablet", 512.99)
    )
    products.sortWith(compareBy({ it.name }, { it.price }))
    products.forEach { println(it) }
}