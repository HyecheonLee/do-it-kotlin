package com.hyecheon.section01

class GenericNull<T> {
    fun EqualityFun(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>()
    obj.EqualityFun("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFun(null, 10)
}