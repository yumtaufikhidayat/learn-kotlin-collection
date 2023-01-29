package main.kotlin.grouping

fun main() {
    grouping()
}

fun grouping() {
    val list = listOf("a", "b", "c", "a", "b", "c")
    val map: Map<String, List<String>> = list.groupBy { it }
    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(map)
    println(grouping)
}