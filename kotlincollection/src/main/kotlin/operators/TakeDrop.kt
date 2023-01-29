package main.kotlin.operators

fun main() {
    takeDrop()
}

fun takeDrop() {
    val chars = ('a'..'z').toList()

    println(chars.take(5))
    println(chars.takeLast(2))
    println(chars.takeWhile { it < 'f' })
    println(chars.takeLastWhile { it > 'w' })

    println(chars.drop(23))
    println(chars.dropLast(23))
    println(chars.dropWhile { it < 'x' })
    println(chars.dropLastWhile { it > 'c' })

}