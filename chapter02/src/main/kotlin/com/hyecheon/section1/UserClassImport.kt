package com.hyecheon.section1

import com.hyecheon.Person as User

fun main(args: Array<String>) {
    val user1 = User("kildong", 30)
    val user2 = Person("A123", "Kildong")
    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)