package set

fun main() {
//    set()
    mutableSet()
}

fun set() {
    val set: Set<Person> = setOf(
        Person("Zharfan Wafiq"),
        Person("Taufik Hidayat"),
        Person("Rudi Cahyadi")
    )

    println("Jumlah data pada set: ${set.size} buah")
    println(set.contains(Person("Eko")))
}

fun mutableSet() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Eko Cahyadi"))
    mutableSet.add(Person("Taufik Hidayat"))
    mutableSet.add(Person("Zharfan Wafiq"))
    mutableSet.add(Person("Eko Cahyadi"))

    println("Jumlah data awal pada mutable set: ${mutableSet.size}")
    println("Eko Cahyadi berada pada index ke-${mutableSet.indexOf(Person("Eko Cahyadi"))}")
    println("Eko Cahyadi dihapus dari mutable set: ${mutableSet.remove(Person("Eko Cahyadi"))}")
    println("Eko Cahyadi berada pada index ke-${mutableSet.indexOf(Person("Eko Cahyadi"))}")
    println("Jumlah data terkini pada mutable set: ${mutableSet.size}")
    println(mutableSet.contains(Person("Eko Cahyadi")))
}