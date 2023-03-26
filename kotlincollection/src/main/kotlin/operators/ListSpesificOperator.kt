package main.kotlin.operators

fun main() {
    listSpecificOperator()
}

fun listSpecificOperator() {
    val list = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    println("Get or null: ${list.getOrNull(1)}") // Hidayat
    println("Get or null: ${list.getOrNull(4)}") // null
    println("Get or else: ${list.getOrElse(1) {}}") // Hidayat
    println("Get or else: ${list.getOrElse(4) { "Ups tidak ada data" }}") // Ups tidak ada data
    println("Sublist: ${list.subList(0, 3)}") // [Taufik, Hidayat, Zharfan]

    val sortedList = list.sorted() // Element diurutkan berdasarkan abjad
    println("Sorted list: ${sortedList.binarySearch("Hidayat")}") // 0 -> karena setelah diurutkan secara abjadi, Hidayat berada di element ke-0
}
