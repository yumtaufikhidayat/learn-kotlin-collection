package main.kotlin.order

fun main() {
    randomOrder()
}

fun randomOrder() {
    val list = (1..10).toList()
    println(list.shuffled())
    println(list.shuffled())
    println(list.shuffled())
    println(list.shuffled())
    println(list.shuffled())
}