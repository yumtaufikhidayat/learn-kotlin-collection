package main.kotlin.positions

fun main() {
    retrieveByPosition()
}

fun retrieveByPosition() {
    val list = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    println(list.first())
    println(list.last())
    println(list.elementAt(1))
    println(list.elementAtOrNull(5))
    println(list.elementAtOrElse(5) { "" })
}
