package com.hyecheon.section03

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

fun main() {
    val path = "./rainbow.txt"
    val file = File(path)
    val inputStream = file.inputStream()
    val lineList = inputStream.bufferedReader().useLines { lines -> lines.toList() }
    lineList.forEach { println("> $it") }
}