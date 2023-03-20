package main.kotlin.operators

fun main() {
    aggregateOperator()
}

fun aggregateOperator() {
    val numbers = (1..100).toList()
    println("Maximum number: ${numbers.max()}") // take maximum number
    println("Minimum number: ${numbers.min()}") // take minimum number
    println("Average number: ${numbers.average()}") // take average number
    println("Sum numbers: ${numbers.sum()}") // take total of sum number
    println("Sum numbers divided by 2: ${numbers.sumOf { it / 2}}")
}