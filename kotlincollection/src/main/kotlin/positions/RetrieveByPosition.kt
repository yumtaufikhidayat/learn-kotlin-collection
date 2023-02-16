package main.kotlin.positions

fun main() {
    retrieveByPosition()
}

fun retrieveByPosition() {
    val list = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    println(list.first()) // Taufik
    println(list[0]) // Taufik
    println(list.elementAt(0)) // Taufik
    println(list.last()) // Wafiq
    println(list.elementAt(1)) // Zharfan
    println(list.elementAtOrNull(5)) // null
    println(list.elementAtOrElse(5) { "No data available" }) // No data available
}
