package com.hyecheon.section05

fun main() {
    val primes = generateSequence(2 to generateSequence(3) { it + 2 }) { value ->
        val currSeq = value.second.iterator()
        val nextPrime = currSeq.next()
        nextPrime to currSeq.asSequence().filter { it % nextPrime != 0 }
    }.map { it.first }
    println(primes.take(10).toList())
}