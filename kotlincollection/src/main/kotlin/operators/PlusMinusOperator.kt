package main.kotlin.operators

fun main() {
    plusMinusOperators()
}

fun plusMinusOperators() {
    val list1 = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    val list2 = list1.plus("Developer")
    val list3 = list1.plus(listOf("Kotlin", "Java", "Python"))
    val list4 = list1.minus("Taufik")
    val list5 = list1.minus(listOf("Hidayat", "Zharfan", "Wafiq"))
    println("list1: $list1")
    println("list2: $list2")
    println("list3: $list3")
    println("list4: $list4")
    println("list5: $list5")

    val map1 = mapOf("a" to "Taufik", "b" to "Hidayat")
    val map2 = map1.plus("c" to "Zharfan")
    val map3 = map1.minus("a")
    println("map1: $map1")
    println("map2: $map2")
    println("map3: $map3")
}