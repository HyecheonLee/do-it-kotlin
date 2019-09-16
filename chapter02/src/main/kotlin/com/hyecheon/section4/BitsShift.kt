package com.hyecheon.section4

fun main() {
    var x = 4
    var y = 0b0000_1010
    var z = 0x0f

    println("x shl 2 -> ${x shl 2}")
    println("x inv() -> ${x.inv()}")

    println("y shr 2 -> ${y / 4}, ${y shr 2}")
    println("y shl 4 -> ${y * 16}, ${y shl 4}")
    println("z shl 4 -> ${y * 16}, ${y shl 4}")

    x = 64
    println("x shr 4 -> ${x / 4}, ${x shr 2}")
}