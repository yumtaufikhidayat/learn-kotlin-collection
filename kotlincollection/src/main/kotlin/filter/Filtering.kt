package filter

fun main() {
    filtering()
}

fun filtering() {
    val list1 = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    val list2 = list1.filter { it.length > 5 }
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    val list4: List<Any?> = listOf(null, 1, "Taufik", "Hidayat", 2, null)
    val list5: List<String> = list4.filterIsInstance<String>()
    val list6: List<Any> = list4.filterNotNull()

    println("---$list1---")
    println("---$list2---")
    println("---$list3---")
    println("---$list4---")
    println("---$list5---")
    println("---$list6---")
}