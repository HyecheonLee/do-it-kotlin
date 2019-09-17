package com.hyecheon.section06

// a() 함수에 b() 함수의 내용을 선언
fun a() = b() // 최상위 함수이므로 b() 함수 선언 위치에 상관없이 사용 가능

fun b() = println("b") // b() 함수의 선언
fun c() {
    //fun d() = e() //오류! d()는 지역함수이며 e()의 이름을 모름
    fun e() = println("e")
}

fun main() {
    a()
}