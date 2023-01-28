package main.kotlin.filter

fun main() {
    testing()
}

fun testing() {
    val list = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    println(list.any { it. length > 5})
    println(list.none { it. length > 5})
    println(list.all { it. length > 5})
    println(list.any())
    println(list.none())
}