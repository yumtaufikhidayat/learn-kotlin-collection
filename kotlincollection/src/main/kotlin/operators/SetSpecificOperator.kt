package main.kotlin.operators

fun main() {
    setSpecificOperator()
}

fun setSpecificOperator() {
    val number1 = (1..10).toSet()
    val number2 = (6..15).toSet()
    val union = number1 union number2
    val intersect = number1 intersect number2
    val subtract = number1 subtract number2
    println("Gabungan: $union") // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    println("Irisan: $intersect") // [6, 7, 8, 9, 10]
    println("Pengurangan: $subtract") // [1, 2, 3, 4, 5]
}
