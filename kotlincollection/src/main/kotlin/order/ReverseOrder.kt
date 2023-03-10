package main.kotlin.order

fun main() {
    reverseOrder()
}

fun reverseOrder() {
    val list = mutableListOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    val listReversed = list.reversed()
    val listAsReversed = list.asReversed()
    list.add("Developer")
    println("Reversed: $listReversed")
    println("As Reversed: $listAsReversed")
}