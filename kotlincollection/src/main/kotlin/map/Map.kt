package map

fun main() {
    immutableMap()
    mutableMap()
}

fun immutableMap() {
    val map: Map<String, String> = mapOf(
        "person1" to "Taufik Hidayat",
        "person2" to "Zharfan Wafiq",
        "person3" to "Budi Oktaviyan"
    )

    println("Jumlah data map: ${map.size}")
    println(map["person1"])
    println(map["person2"])
    println(map["person3"])

    val map2 = mapOf(
        "key1" to "Taufik Hidayat",
        "key2" to 10,
        1 to "value3"
    )

    println(map2["key1"])
    println(map2["key2"])
    println(map2[1])
}

fun mutableMap() {
    val mutableMap: MutableMap<String, Int> = mutableMapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3,
    )

    println(mutableMap["key1"])
    println(mutableMap["key2"])
    println(mutableMap["key3"])

    val mutableMap2 = mutableMapOf<String, Int>()
    mutableMap2["key1"] = 1
    mutableMap2["key2"] = 2
    mutableMap2["key3"] = 3

    println(mutableMap2["key1"])
    println(mutableMap2["key2"])
    println(mutableMap2["key3"])

    val mutableMap3: MutableMap<String, Int> = mutableMapOf()
    mutableMap3["key1"] = 1
    mutableMap3["key2"] = 2
    mutableMap3["key3"] = 3

    println(mutableMap3["key1"])
    println(mutableMap3["key2"])
    println(mutableMap3["key3"])

    mutableMap3.replace("key1", 5)
    mutableMap3.remove("key3")
    println(mutableMap3["key1"])
    println(mutableMap3["key3"])

    if (mutableMap3.containsKey("key3")) {
        println(mutableMap3["key3"])
    } else {
        println("Data key tidak ditemukan")
    }

    println("Daftar keys: ${mutableMap3.keys}")
}