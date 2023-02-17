package main.kotlin.positions

fun main() {
    retrieveByRandom()
}

fun retrieveByRandom() {
    val list = (1..10).toList()
    println(list.random())
    println(list.random())
    println(list.random())
    println(list.random())
    println(list.random())
}
