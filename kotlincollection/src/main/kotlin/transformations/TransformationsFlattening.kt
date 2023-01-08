package transformations

fun main() {
    transformationsFlattening()
    memberHobbies()
}

fun transformationsFlattening() {
    val list: List<List<String>> = listOf(
        listOf("Taufik", "Hidayat"),
        listOf("Android", "Developer")
    )
    val flattenList: List<String> = list.flatten()
    println(flattenList)
    flattenList.forEachIndexed { index, s ->
        println("index ke-$index adalah $s")
    }
}

class Member(val name: String, val hobbies: List<String>)

fun memberHobbies() {
    val members: List<Member> = listOf(
        Member("Taufik Hidayat", listOf("Travelling", "Gaming")),
        Member("Zharfan Wafiq", listOf("Working", "Studying"))
    )

    val hobbies: List<String> = members.flatMap { member -> member.hobbies }
    println("hobbies: $hobbies")
}