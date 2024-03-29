package com.hyecheon.section05

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }

    fun access() {
        protectedFunc()
    }

    protected class Nested
}

class Derived : Base() {
    fun test(base: Base): Int {
        protectedFunc()
        return i
    }
}

fun main() {
    val base = Base()
//    base.i //접근 불가
//    base.protectedFunc() // 접근 불가
    base.access()
}