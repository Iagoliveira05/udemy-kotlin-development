package com.example.rockpaperscissors

fun main() {

    var computerChoice = ""
    var playerChoice : String? = ""

    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readLine()
    
    while (playerChoice?.lowercase() != "rock" && playerChoice?.lowercase() != "paper" && playerChoice?.lowercase() != "scissors") {
        println("Invalid option! \nEnter your choice again!")
        
        playerChoice = readLine()
    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }

    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's tie")
    } else {
        println("The winner is: $winner")
    }

}