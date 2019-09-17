package com.hyecheon.section4

import java.util.concurrent.locks.ReentrantLock

var sharable = 1
fun main() {
    val reLock = ReentrantLock()
    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }
    lock(reLock, ::criticalFunc)
    println(sharable)

}

fun criticalFunc() {
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T) = with(reLock) {
    reLock.lock()
    try {
        body()
    } finally {
        reLock.unlock()
    }
}

