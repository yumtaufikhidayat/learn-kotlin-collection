package main.kotlin.operators

fun main() {
    mapSpecificOperator()
}

fun mapSpecificOperator() {
    val map = mapOf(
        "a" to "Taufik",
        "b" to "Hidayat",
        "c" to "Zharfan",
        "d" to "Wafiq"
    )

    val getValue = map.getValue("a")
    val getOrElse = map.getOrElse("e") { "Data tidak ditemukan" }
    val filter = map.filter { (_, value) -> value.length > 5 }
    val filterKeys = map.filterKeys { key -> key > "a" }
    val filterValues = map.filterValues { value -> value.length > 5 }

    println("Get value: $getValue") // Taufik
    println("Get or else: $getOrElse") // Data tidak ditemukan
    println("Filter: $filter") // {a=Taufik, b=Hidayat, c=Zharfan}
    println("Filter keys: $filterKeys") // {b=Hidayat, c=Zharfan, d=Wafiq}
    println("Filter values: $filterValues") // {a=Taufik, b=Hidayat, c=Zharfan}
}
