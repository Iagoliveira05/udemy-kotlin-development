package com.example.kotlinbasics.exercises

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    println(numbers)

    for (number in 0 until numbers.size) {
        numbers[number] = numbers[number] * 2
    }

    println(numbers)

}