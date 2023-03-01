package main.kotlin.order

fun main() {
    customOrdering()
}

fun customOrdering() {
    val fruits = listOf(
        Fruit("Apple", 20),
        Fruit("Banana", 15),
        Fruit("Anggur", 5)
    )

    println("Sorted by name: ${fruits.sortedBy { it.name }}")
    println("Sorted by quantity: ${fruits.sortedBy { it.quantity }}")
    println("Sorted by descending name: ${fruits.sortedByDescending { it.name }}")
    println("Sorted by descending quantity: ${fruits.sortedByDescending { it.quantity }}")
    println("Sorted with compared by name: ${fruits.sortedWith(compareBy { it.name })}")
    println("Sorted with compared by quantity: ${fruits.sortedWith(compareBy { it.quantity })}")
    println("Sorted with compared by descending name: ${fruits.sortedWith(compareByDescending { it.name })}")
    println("Sorted with compared by descending quantity: ${fruits.sortedWith(compareByDescending { it.quantity })}")
    println("Custom compare: ${fruits.sortedWith { a, b ->
        a.quantity.compareTo(b.quantity)
    }}")
}

data class Fruit(val name: String, val quantity: Int)