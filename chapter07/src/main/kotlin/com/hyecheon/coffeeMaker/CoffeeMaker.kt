package com.hyecheon.coffeeMaker

class CoffeeMaker(val coffeeModule: CoffeeModule) {
    fun brew() {
        val theSiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.off()
        theSiphon.pump()
        println("Coffee, here! Enjoy!~")
        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}