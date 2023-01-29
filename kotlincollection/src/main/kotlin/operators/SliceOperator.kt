package main.kotlin.operators

fun main() {
    sliceOperator()
}

fun sliceOperator() {
    val list1 = (0..100).toList()
    val list2 = list1.slice(0..50)
    val list3 = list1.slice(0..100 step 2)
    val list4 = list1.slice(100 downTo 0 step 2)

    println("list1: $list1")
    println("list2: $list2")
    println("list3: $list3")
    println("list4: $list4")
}