package com.hyecheon.coffeeMaker

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}