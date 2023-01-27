package main.kotlin.filter

fun main() {
    filteringPartitioning()
}

fun filteringPartitioning() {
    val list = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }
    println(list)
    println(listMatch)
    println(listNotMatch)
}