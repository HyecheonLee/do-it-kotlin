package com.hyecheon.section01

fun main() {
    data class Person(var name: String, var skills: String)

    val person = Person("Kildong", "Kotlin")
    val a = person.let {
        it.skills = "Android"
        "success"
    }
    println(person)
    println("a: $a")
    val b = person.also {
        it.skills = "Java"
        "success"
    }
    println(person)
    println("b: $b")
}