package main.kotlin.operators

fun main() {
    foldReduce()
}

fun foldReduce() {
    val numbers = (1..5).toList()
    val max = numbers.reduce { first, second ->
        if (first > second) first else second
    }

    val min = numbers.reduce { first, second ->
        if (first < second) second else first
    }

    val sum = numbers.fold(0) { acc, i ->
        acc + i
    }

    println("Nilai terbesar: $max")
    println("Nilai terkecil: $min")
    println("Jumlah total: $sum")
}
