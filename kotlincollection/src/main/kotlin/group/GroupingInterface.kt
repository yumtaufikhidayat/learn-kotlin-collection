package main.kotlin.group

fun main() {
    groupingInterface()
}

fun groupingInterface() {
    val list = listOf("a", "b", "c", "b", "a", "c")
    val intList = listOf(1, 1, 2, 2, 3, 3)
    val grouping: Grouping<Int, Int> = intList.groupingBy { it }
    println("Jumlah data di tiap group: ${grouping.eachCount()}")
    println("Grouping fold: ${grouping.fold(0) { accumulator, element -> 
        accumulator + element
    }}")

    println("Grouping reduce: ${grouping.reduce { _, accumulator, element ->
        accumulator + element
    }}")

    println("Grouping aggregate: ${grouping.aggregate { _, accumulator: Int?, element, first ->  
        if (first) element else accumulator?.plus(element)
    }}")
}
