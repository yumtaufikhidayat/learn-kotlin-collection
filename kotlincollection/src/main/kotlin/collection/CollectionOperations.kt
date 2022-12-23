package main.kotlin.collection

fun main() {
    collectionOperations()
}

fun collectionOperations() {
//  Modern approach of for loop
    listOf("Taufik", "Hidayat").forEach { value -> println(value) }

//  Traditional approach of for loop
    val data = listOf("Taufik", "Hidayat")
    for (i in data) {
        println(i)
    }

//  Modern approach of for loop with index
    listOf("Taufik", "Hidayat", "Zharfan", "Wafiq").forEachIndexed { index, value ->
        println("$index = $value")
    }

//  Traditional approach of for loop with index
    val dataIndex = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    for ((index, value) in dataIndex.withIndex()) {
        println("$index = $value")
    }
}