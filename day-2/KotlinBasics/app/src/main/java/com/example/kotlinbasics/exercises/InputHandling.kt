package com.example.kotlinbasics.exercises

fun main() {
    println("Please enter a number: ")

    val inputString = readln()
    val inputNumber = inputString.toInt()

    val multiplier = 3

    println(inputNumber * multiplier)
}