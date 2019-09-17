package com.hyecheon.section05.LocalReturnCrossinline.kt

fun main() {
    shortFunc(3) {
        println("First call $it")
//        return 사용불가
    }
}

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}