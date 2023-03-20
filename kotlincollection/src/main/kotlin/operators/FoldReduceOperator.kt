package main.kotlin.operators

fun main() {
    foldReduce()
}

fun foldReduce() {
    val numbers = (1..100).toList().shuffled()
    val max = numbers.reduce { first, second ->
        if (first > second) first else second
    }

    val min = numbers.reduce { first, second ->
        if (first < second) first else second
    }

    val sum = numbers.fold(0) { first, second ->
        first + second
    }

    println("Nilai terbesar: $max")
    println("Nilai terkecil: $min")
    println("Jumlah total: $sum")
}
