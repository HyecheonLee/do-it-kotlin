package com.hyecheon.section01

open class Parent
class Child : Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child()
//    val obj2: Child = Parent() // 오류

//    val obj3: Cup<Parent> = Cup<Child>() // 오류
//    val obj4: Cup<Child> = Cup<Parent>() // 오류
    val obj5 = Cup<Child>()
    val obj6 = obj5
}