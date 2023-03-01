package main.kotlin.order

fun main() {
    customOrdering()
}

fun customOrdering() {
    val fruits = listOf(
        Fruit("Apple", 20),
        Fruit("Banana", 15)
    )

    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.quantity })
    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedByDescending { it.quantity })
    println(fruits.sortedWith(compareBy { it.name }))
    println(fruits.sortedWith(compareBy { it.quantity }))
    println(fruits.sortedWith(compareByDescending { it.name }))
    println(fruits.sortedWith(compareByDescending { it.quantity }))
    println(fruits.sortedWith { a, b ->
        a.quantity.compareTo(b.quantity)
    })
}

data class Fruit(val name: String, val quantity: Int)