package main.kotlin.collection

fun main() {
    collectionOperations()
}

fun collectionOperations() {
//  Modern approach
    listOf("Taufik", "Hidayat").forEach { value -> println(value) }

//  Traditional approach
    val data = listOf("Taufik", "Hidayat")
    for (i in data) {
        println(i)
    }

//  Modern approach
    listOf("Taufik", "Hidayat", "Zharfan", "Wafiq").forEachIndexed { index, value ->
        println("$index = $value")
    }

//  Traditional approach
    val dataIndex = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    for ((index, value) in dataIndex.withIndex()) {
        println("$index = $value")
    }
}