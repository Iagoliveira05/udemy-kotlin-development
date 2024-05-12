package com.example.kotlinbasics


data class CoffeeDetails(val sugarCount: Int,
                        val name : String,
                        val size : String,
                        val creamAmount : Int) {

}


fun main() {

    //region Arithmetic

    /*

        println("Write the first number")
        val firstNumber = readln().toDouble()

        println("Write the second number")
        val secondNumber = readln().toDouble()

        //println("The result of $firstNumber + $secondNumber is : ${add(firstNumber, secondNumber)}")
        println("The result of $firstNumber / $secondNumber is : ${divide(firstNumber, secondNumber)}")

     */
    //endregion

    //region Coffee

    //askCoffeeDetails()

    val coffeeForIago = CoffeeDetails(0, "Iago", "xxl", 0)
    makeCoffee(coffeeForIago)

    //endregion

    //region Dog

    /*
    var daisy = Dog("Daisy", "Poodle", 1)

    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    println("A year has passed")
    daisy.age = 2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

     */
    //endregion

}

fun askCoffeeDetails() {
    println("Write your name")
    val name = readln()

    println("How many spoons of sugar?")
    val sugar = readln().toInt()

    //makeCoffee(sugar, name)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 0) {
        println("Coffee with no spoons of sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
    } else if (coffeeDetails.sugarCount == 1) {
        println("Coffee with one spoon of sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
    }
}
fun add(number1: Int, number2: Int) : Int {
    val result = number1 + number2
    return result
}

fun divide(number1: Double, number2: Double) : Double {
    val result = number1 / number2
    return result
}
