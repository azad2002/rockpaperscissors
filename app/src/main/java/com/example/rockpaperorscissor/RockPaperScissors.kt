package com.example.rockpaperorscissor

fun main() {
    var playerChoice = ""
    var computerChoice = ""
    println("Rock,Paper or Scissors,Enter the choice! ")
    playerChoice = readln()
    val randomNumber =(1..3).random()
    if (randomNumber == 1) {
        computerChoice = "Rock"
    }
    else if (randomNumber == 2) {
        computerChoice = "Paper"
    }
    else if (randomNumber == 3) {
        computerChoice = "Scissors"
    }
    //azad farooqg
    println(computerChoice)
    val winner = when{
        playerChoice==computerChoice -> "Tie"
        playerChoice=="Rock" && computerChoice=="Scissors" -> "Player"
        playerChoice=="Paper" && computerChoice=="Rock" -> "Player"
        playerChoice=="Scissors" && computerChoice=="Paper" -> "Player"
        else -> "Computer"
    }
    if (winner=="Tie") {
        println("Its a tie")
    }else{
        println(winner+ "won")
    }

}






