package main.kotlin.transformations

fun main() {
    transformationsZipping()
    transformationsUnzipping()
}

fun transformationsZipping() {
    println("----- Transformations Zipping -----")
    val listA = listOf("Taufik", "Hidayat")
    val listB = listOf("Zharfan", "Wafiq")
    val zipList: List<Pair<String, String>> = listA.zip(listB)
    val listC = listA.zip(listB) { itemA, itemB ->
        itemA + itemB
    }

    println(zipList)
    println(listC)
}

fun transformationsUnzipping() {
    println("\n----- Transformations Unzipping -----")
    val list: List<Pair<String, String>> = listOf(
        "Taufik" to "Hidayat",
        "Zharfan" to "Wafiq"
    )
    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair)
}