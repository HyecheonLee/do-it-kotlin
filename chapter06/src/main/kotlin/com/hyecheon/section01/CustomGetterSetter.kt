package com.hyecheon.section01.CustomGetterSetter

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("THe name was changed")
            field = value.toUpperCase()
        }
    var age: Int = _age
}

fun main() {
    val user1 = User(1, "kildong", 30)
    user1.name = "coco"
    println("user1.age = ${user1.name}")
}

