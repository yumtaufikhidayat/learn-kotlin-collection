package main.kotlin.operators

fun main() {
    listSpecificOperator()
    indexNumber()
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

fun indexNumber() {
    println("----- Index Number -----")
    val numbers = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    indexOfNumber(2, numbers)
    indexOfNumber(3, numbers)
    lastIndexOfNumber(3, numbers)
    lastIndexOfNumber(4, numbers)
    indexOfFirst(3, numbers, ">")
    indexOfFirst(4, numbers, ">")
    indexOfFirst(3, numbers, "<")
    indexOfFirst(4, numbers, "<")
    indexOfLast(3, numbers, ">")
    indexOfLast(4, numbers, ">")
    indexOfLast(3, numbers,"<")
    indexOfLast(4, numbers,"<")
}

fun indexOfNumber(number: Int, index: List<Int>) {
    println("Angka $number berada pada index ke-${index.indexOf(number)}")
}

fun lastIndexOfNumber(number: Int, index: List<Int>) {
    println("Angka $number berada pada index ke-${index.lastIndexOf(number)}")
}

fun indexOfFirst(number: Int, index: List<Int>, type: String) {
    when (type) {
        ">" -> println("Index pertama dari kondisi jika > $number, yaitu ${index.indexOfFirst { it > number }}")
        else -> println("Index pertama dari kondisi jika < $number, yaitu ${index.indexOfFirst { it < number }}")
    }
}

fun indexOfLast(number: Int, index: List<Int>, type: String) {
    when (type) {
        ">" -> println("Index terakhir dari kondisi jika > $number, yaitu ${index.indexOfLast { it > number }}")
        else -> println("Index terakhir dari kondisi jika < $number, yaitu ${index.indexOfLast { it < number }}")
    }
}