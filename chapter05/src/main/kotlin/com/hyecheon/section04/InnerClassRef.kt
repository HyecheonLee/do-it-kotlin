package com.hyecheon.section04.innerref

open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")

}

class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() {
        println("Child Class f()")
    }

    inner class Inside {
        fun f() = println("Inside class f()")
        fun test() {
            Child().f()
            super@Child.f()
            println("[Inside] super@Child.x: ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}