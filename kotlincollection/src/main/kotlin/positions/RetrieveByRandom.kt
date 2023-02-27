package main.kotlin.positions

fun main() {
    retrieveByRandom()
    retrieveStringByRandom()
}

fun retrieveByRandom() {
    val list = (1..10).toList()
    println(list.random())
    println(list.random())
    println(list.random())
    println(list.random())
    println(list.random())
}

fun retrieveStringByRandom() {
    val data = listOf("Zharfan", "Wafiq", "Taufik", "Hidayat")
    println(data.random())
    println(data.random())
}
