package com.example.kotlinbasics.exercises

fun main() {

    val myBook = BookClass()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)

    val customBook = BookClass("dasd", "dasd", 3123)
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)

}