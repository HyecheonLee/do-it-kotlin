package com.hyecheon.section03

fun main() {
    noParam({ "Hello World!" })
    noParam { "Hello World!" }
}

fun noParam(out: () -> String) = println(out())
