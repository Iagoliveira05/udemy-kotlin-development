package com.example.kotlinbasics.exercises

fun main() {
    print("Digite a sua idade: ")
    val idade = readln().toInt()

    if (idade in 18 .. 40) {
        println("Pode entrar no clube")
    } else {
        println("Idade nao verificada, verifique com o suporte!")
    }

}