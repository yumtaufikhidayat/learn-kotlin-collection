package map

fun main() {
    map()
}

fun map() {
    val map: Map<String, String> = mapOf(
        "person1" to "Taufik Hidayat",
        "person2" to "Zharfan Wafiq",
        "person3" to "Budi Oktaviyan"
    )

    println("Jumlah data map: ${map.size}")
    println(map["person1"])
    println(map["person2"])
    println(map["person3"])
}