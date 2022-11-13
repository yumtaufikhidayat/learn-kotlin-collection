package list

fun main() {
    immutableList()
    mutableList()
}

fun immutableList() {
    val list: List<String> = listOf("Taufik", "Hidayat")
    println(list[0])
    println(list[1])
    println(list.isEmpty()) // same as println(list.size == 0)
    println(list.indexOf("Taufik"))
    println(list.indexOf("Hidayat"))
}

fun mutableList() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Taufik")
    mutableList.add("Hidayat")
    mutableList.add("Apel")
    mutableList.add("Mangga")
    mutableList.add("Pisang")
    println(mutableList[0])
    println(mutableList[1])
    println(mutableList[2])
    println(mutableList.isEmpty())

    println("List sebelum diubah: $mutableList")
    mutableList[2] = "Anggur"
    mutableList.removeAt(1)
    println("List setelah diubah: $mutableList")
}