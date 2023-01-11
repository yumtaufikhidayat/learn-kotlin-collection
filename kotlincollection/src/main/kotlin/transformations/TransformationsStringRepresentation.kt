package transformations

fun main() {
    transformationsStringRepresentation()
}

fun transformationsStringRepresentation() {
    val names = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    println(names.joinToString(" ", "|", "|"))
    println(names.joinToString(" ", "|", "|") { "Item: $it" })

    val appendable = StringBuilder()
    names.joinTo(appendable, ", ", "|", "|") { it }
    println(appendable.toString())
}