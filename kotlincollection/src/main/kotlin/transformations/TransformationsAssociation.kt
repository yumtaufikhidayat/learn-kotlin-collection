package transformations

fun main() {
    transformationsAssociation()
}

fun transformationsAssociation() {
    val list = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    val map1: Map<String, Int> = list.associate { Pair(it, it.length) }
    val map2: Map<String, Int> = list.associateWith { it.length }
    val map3: Map<Int, String> = list.associateBy { it.length }

    println(map1)
    println(map2)
    println(map3)
}