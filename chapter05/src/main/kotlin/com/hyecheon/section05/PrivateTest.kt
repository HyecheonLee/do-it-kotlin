package com.hyecheon.section05

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }

    fun access() {
        privateFunc()
    }
}

class OtherClass {
    //    val opc = PrivateClass() // 불가 - 프로퍼티 opc 는 private이 되어야함
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
//    pc.i//접근 불가
//    pc.privateFunc() // 접근불가
}

fun TopFunction() {
    val tcp = PrivateClass() // 객체 생성 가능
}