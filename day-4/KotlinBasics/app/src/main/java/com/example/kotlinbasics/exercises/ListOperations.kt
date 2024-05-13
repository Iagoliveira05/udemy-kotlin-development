package com.example.kotlinbasics.exercises

fun main() {
    val fruitList = mutableListOf("Apple", "Orange", "Tangerine", "Grape", "Pineapple")

    println(fruitList)

    fruitList.add("Mango")
    println(fruitList)

    fruitList.remove("Apple")
    println(fruitList)

    if (fruitList.contains("Orange")) {
        println("Orange in the list")
    } else {
        println("Orange not in the list")
    }

}