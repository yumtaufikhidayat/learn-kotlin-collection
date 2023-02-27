package main.kotlin.checking

fun main() {
    checkingExistence()
}

fun checkingExistence() {
    val range = (1..10).toList()
    println(range.contains(3))
    println(range.containsAll(listOf(2, 3, 4)))
    println(range.isEmpty())
    println(range.isNotEmpty())
    println(range.isNullOrEmpty())
}