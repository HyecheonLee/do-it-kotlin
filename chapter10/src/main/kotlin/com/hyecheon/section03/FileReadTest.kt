package com.hyecheon.section03

import java.io.FileReader

fun main() {
    val path = "./rainbow.txt"
    val read = FileReader(path)
    println(read.readText())
}