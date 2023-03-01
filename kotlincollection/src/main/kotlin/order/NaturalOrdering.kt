package main.kotlin.order

fun main() {
    naturalOrdering()
}

fun naturalOrdering() {
    val numbers = listOf(1, 2, 4, 3, 7, 9, 100, 11, 32)
    println(numbers.sorted()) // 1, 2, 3, 4, 7, 9, 11, 32, 100
    println(numbers.sortedDescending()) // 100, 32, 11, 9, 7, 4, 3, 2, 1
}