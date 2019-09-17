package com.hyecheon.section01

fun main() {
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) {
    for (count in counts) {
        print("${count} ")
    }
    println()
}
