package com.hyecheon.section01

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("../output.txt")).use {
        it.println("hello")
    }
}