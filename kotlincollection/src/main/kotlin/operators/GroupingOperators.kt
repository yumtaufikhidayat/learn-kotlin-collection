package main.kotlin.operators

fun main() {
    grouping()
    groupings()
}

fun grouping() {
    val list1 = listOf("a", "b", "c", "a", "b", "c")
    val map1: Map<String, List<String>> = list1.groupBy { it }
    val grouping1: Grouping<String, String> = list1.groupingBy { it }
    val list2 = listOf("Zharfan", "Budi", "Caca", "Taufik", "Budi", "Caca", "Hidayat", "Eko", "Eko")
    val map2: Map<String, List<String>> = list2.groupBy { it }
    val grouping2: Grouping<String, String> = list2.groupingBy { it }
    println(map1)
    println(grouping1)
    println(map2)
    println(grouping2)
}

data class Todo(val taskName: String, val taskStatus: String)
fun groupings() {
    val taskList = listOf(
        Todo("Matematika", "Selesai"),
        Todo("Bahasa Indonesia", "Selesai"),
        Todo("Fisika", "Belum Selesai"),
        Todo("Bahasa Inggris", "Selesai"),
        Todo("IT", "Belum Selesai")
    )

    val taskByStatus = taskList.groupBy({it.taskStatus}, {it.taskName})
    val taskByStatusCount = taskList.groupingBy { it.taskStatus }.eachCount()
    println(taskByStatus)
    println(taskByStatusCount)
}