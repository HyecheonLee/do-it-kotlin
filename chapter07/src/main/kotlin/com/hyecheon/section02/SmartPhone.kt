package com.hyecheon.section02

interface Switcher {
    fun on(): String
}

class SmartPhone(val model: String) {
    private val cpu = "Exynos"
    fun powerOn(): String {
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }

        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }
}

fun main() {
    val mySdcard = SmartPhone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myPhone = SmartPhone("Note9")
    myPhone.ExternalStorage(128)
    println(myPhone.powerOn())
}