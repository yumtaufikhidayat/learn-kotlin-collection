package main.kotlin.map

fun main() {
    destructuringOnMap()
}

fun destructuringOnMap() {
    val map = mapOf(
        "a" to "Taufik",
        "b" to "Hidayat",
        "c" to "Zharfan",
        "d" to "Wafiq"
    )

    for ((key, value) in map) {
        println("$key, $value")
    }
    map.forEach { (key, value) -> println("$key, $value") }
    map.forEach { entry -> println("${entry.component1()}, ${entry.component2()}") }
}