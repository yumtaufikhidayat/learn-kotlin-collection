package pair

fun main() {
    pair()
}

fun pair() {
    val pair = Pair("Taufik", "Hidayat")
    println(pair.first)
    println(pair.second)

    val pair2: Pair<Int, String> = 1 to "Hidayat"
    println(pair2.first)
    println(pair2.second)

    val pair3: Pair<Int, String> = Pair(1, "Hidayat")
    println(pair3.first)
    println(pair3.second)
}