package iterator

fun main() {
    iterator()
    mutableListIterator()
}

fun iterator() {
    displayListIterator(listOf("Taufik", "Hidayat", "Zharfan", "Wafiq").listIterator())
    displayListIterator(listOf("Rudi", "Hartono", "Susi", "Susanti").listIterator())
}

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    while (listIterator.hasNext()) println(listIterator.next())
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun mutableListIterator() {
    removeOddNumber(mutableListOf(1, 2, 3, 4, 5, 6, 7).listIterator())
    println("---")
    displayMutableListIterator(mutableListOf(1, 2, 3, 4, 5, 6).listIterator())
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val item = mutableListIterator.next()
        if (item % 2 == 1) mutableListIterator.remove() else println(mutableListIterator.next())
    }
}

fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
}