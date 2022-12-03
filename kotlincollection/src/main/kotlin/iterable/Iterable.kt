package iterable

fun main() {
    iterable()
    mutableIterable()
}

fun iterable() {
    displayIterable(listOf("Taufik", "Hidayat"))
    displayIterable(listOf("Zharfan", "Wafiq"))
    displayIterable(listOf("Budi", "Gunardi"))
}

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun mutableIterable() {
    displayMutableIterable(mutableListOf("Budi", "Gunardi"))
    displayMutableIterable(mutableListOf("Zharfan", "Wafiq"))
    displayMutableIterable(mutableListOf("Taufik", "Hidayat"))
}

fun <T> displayMutableIterable(mutableIterable: MutableIterable<T>) {
    val iterator = mutableIterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}