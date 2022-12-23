package main.kotlin.conversioncollection

fun main() {
    conversionCollection()
}

fun conversionCollection() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val range = 1..100
    val list = range.toList()
    val mutableList = array.toMutableList()
    val set = list.toSet()
    val mutableSet = list.toMutableSet()
    val sortedSet = list.toSortedSet()

    println(list)
    println(mutableList)
    println(set)
    println(mutableSet)
    println(sortedSet)
}