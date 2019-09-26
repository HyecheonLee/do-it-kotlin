package com.hyecheon.section01

fun main() {
    data class User(var name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "Kotlin")
    val result = with(user) {
        skills = "Kotlin"
        email = "Kildong@example.com"
    }
    println(user)
    println("result: $result")
}