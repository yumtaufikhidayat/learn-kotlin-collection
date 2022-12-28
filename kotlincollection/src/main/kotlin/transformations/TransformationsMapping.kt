package main.kotlin.transformations

fun main() {
    transformationsMapping()
    transformationsMappingMap()
}

fun transformationsMapping() {
    println("----- Transformations Mapping-----")
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

    val transformsList4 = list.mapIndexed { index, item ->
        "Index ke-$index = $item"
    }

    val transformsList5 = list.mapIndexedNotNull { index, value ->
        if (value == "Taufik") "$value berada pada index ke-$index" else null
    }

    println(transformsList1)
    println(transformsList2)
    println(transformsList3)
    println(transformsList4)
    println(transformsList5)
}

fun transformationsMappingMap() {
    println("\n----- Transformations Mapping for Map-----")
    val map: Map<Int, String> = mapOf(
        1 to "Taufik",
        2 to "Hidayat",
        3 to "Zharfan",
        4 to "Wafiq"
    )
    val transformsMap1 = map.mapKeys { it.key * 10 }
    val transformsMap2 = map.mapValues { it.value.toUpperCase() }

    println(transformsMap1)
    println(transformsMap2)
}