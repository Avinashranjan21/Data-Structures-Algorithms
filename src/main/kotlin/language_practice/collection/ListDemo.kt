package language_practice.collection

fun main() {
    val imMutableList = listOf("A", "B", "C", "D")
    println("This is immutable list $imMutableList")
    var mutableList = mutableListOf("A", "B", "C", "D")
    mutableList.add("E") // Data can be added or removed from mutable list
    mutableList.removeAt(0)
    println("This is immutable list $mutableList")
    mutableList = imMutableList.toMutableList()
    mutableList.addAll(listOf("E", "F", "G", "H"))
    println("This is updated immutable list $mutableList")
}