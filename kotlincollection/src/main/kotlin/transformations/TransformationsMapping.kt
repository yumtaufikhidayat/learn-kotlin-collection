package main.kotlin.transformations

fun main() {
    transformationsMapping()
}

fun transformationsMapping() {
    val list: List<String> = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    val transformsList1: List<String> = list.map { item ->
        item.toUpperCase()
    }

    val transformsList2: List<Int> = list.map { item ->
        item.length
    }

    val transformsList3: List<String> = list.mapNotNull { value ->
        if (value == "Taufik") value else null
    }

    println(transformsList1)
    println(transformsList2)
    println(transformsList3)
}