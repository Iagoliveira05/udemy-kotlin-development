package com.example.kotlinbasics

fun main() {

    // Immutable list - you cannot add items after the initialization
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // Mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    // adding items to list
    shoppingList.add("Cooler System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")
    shoppingList[4] = "Graphics AMD 5800"

    val hasRam = shoppingList.contains("RAM")
    if (hasRam) {
        println("Has RAM in the list")
    } else {
        println("No RAM in the list")
    }

    //shoppingList.set(1, "Water Cooling")
    println(shoppingList)

    println(shoppingList.size)
    for (index in 0 until shoppingList.size) {
        println("item ${shoppingList[index]} is at index $index")
    }


}