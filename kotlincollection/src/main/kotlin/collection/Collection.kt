package main.kotlin.collection

fun main() {
    displayCollection(listOf("Taufik Hidayat", "25", "Medan"))
    displayCollection(setOf("Budi Raharjo", "35", "Surabaya"))
    displayCollection(mapOf("key1" to "Budi Kemuliaan").entries)
//    displayCollection(mapOf("key2" to "Budi Wijaya")) // Error because map is not Collection

    displayMutableCollection(mutableListOf("Hidayat Taufik", "25", "Medan"))
    displayMutableCollection(mutableSetOf("Raharjo Budi", "35", "Surabaya"))
    displayMutableCollection(mutableMapOf("key1" to "Kemuliaan Budi").entries)
//    displayMutableCollection(mutableMapOf("key2" to "Budi Wijaya")) // Error because mutableMap is not MutableCollection
}

fun <T> displayCollection(collection: Collection<T>) {
    for (item in collection) println(item)
}

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) println(item)
}

