package ru.netology

fun main() {
    val previousBuy = 10230.00
    var currentBuy = 2500.00
    val isMusicLover = true

    if (previousBuy in 1001.00..10000.00) {
        currentBuy-=100
    } else if (previousBuy > 10000.00) {
        currentBuy -= (currentBuy * 0.05)
    }

    if(isMusicLover) currentBuy -= (currentBuy * 0.01)

    println("Total to pay: $currentBuy rub")

}