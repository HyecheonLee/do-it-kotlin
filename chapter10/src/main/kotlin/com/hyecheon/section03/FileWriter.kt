package com.hyecheon.section03

import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "./hello.txt"
    val text = "안녕하세요! Hello World\n"
    Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
}