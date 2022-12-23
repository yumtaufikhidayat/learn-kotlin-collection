package main.kotlin.collection

fun main() {
    collectionOperations()
}

fun collectionOperations() {
    listOf("Taufik", "Hidayat").forEach { value -> println(value) }
    listOf("Taufik", "Hidayat", "Zharfan", "Wafiq").forEachIndexed { index, value ->
        println("$index = $value")
    }
}