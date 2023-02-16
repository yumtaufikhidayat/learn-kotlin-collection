package main.kotlin.positions

fun main() {
    retrieveByCondition()
}

fun retrieveByCondition() {
    val list = (1..20).toList()
    println(list.first { it > 10 }) // 11
    println(list.last { it > 10 }) // 20
    println(list.firstOrNull { it > 20 }) // null
    println(list.lastOrNull { it > 20 }) //null
    println(list.find { it > 20 }) // null
    println(list.findLast { it > 20}) // null
}
