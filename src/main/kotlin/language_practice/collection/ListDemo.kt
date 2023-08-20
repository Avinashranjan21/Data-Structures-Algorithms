package language_practice.collection

fun main() {
    val imMutableList = listOf("A", "B", "C", "D")
    println("This is immutable list $imMutableList")
    var mutableList = mutableListOf("A", "B", "C", "D")
    mutableList.add("E") // Data can be added or removed from mutable list
    mutableList.removeAt(0)
    mutableList.remove("B")
    println("This is immutable list $mutableList")
    mutableList = imMutableList.toMutableList()
    mutableList.addAll(listOf("E", "F", "G", "H"))
    println("This is updated immutable list $mutableList")
    val resultList = imMutableList + mutableList
    println("The returned list is of type Immutable list $resultList")

    println("Loop demo for list")

    for (item in 0..mutableList.lastIndex){
        println("The item is ${mutableList[item]} at index $item")
    }

    // Modified version of above code

    for (item in mutableList){
        println("The item is $item")
    }

    // Iterating with index and the item from the list
    for ((index, value) in mutableList.withIndex()){
        println("The item is $value at index $index")
    }
}