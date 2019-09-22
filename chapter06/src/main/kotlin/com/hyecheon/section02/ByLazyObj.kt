package com.hyecheon.section02.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false
    val person: Person by lazy {
        isPersonInstantiated = true
        Person("kim", 23)
    }
    val personDelegate = lazy { Person("Hong", 40) }

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.nam = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}