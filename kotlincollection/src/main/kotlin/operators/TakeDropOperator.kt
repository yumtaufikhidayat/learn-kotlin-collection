package main.kotlin.operators

fun main() {
    takeDrop()
}

fun takeDrop() {
    val chars = ('a'..'z').toList()

    println("Take 5 chars: ${chars.take(5)}")
    println("Take last 2 chars: ${chars.takeLast(2)}")
    println("Take while < f: ${chars.takeWhile { it < 'f' }}")
    println("Take last while > w: ${chars.takeLastWhile { it > 'w' }}")

    println("Drop 23 chars: ${chars.drop(23)}")
    println("Drop last 23 chars: ${chars.dropLast(23)}")
    println("Drop while < x: ${chars.dropWhile { it < 'x' }}")
    println("Drop last while > c: ${chars.dropLastWhile { it > 'c' }}")

}