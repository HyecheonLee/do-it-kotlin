package com.hyecheon.section01

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString = "안녕하세요!\tHello\r\nWorld!."
    val path = "./testfile.txt"

    PrintWriter(File(path)).use { printWriter: PrintWriter ->
        printWriter.println(outString)
    }

}