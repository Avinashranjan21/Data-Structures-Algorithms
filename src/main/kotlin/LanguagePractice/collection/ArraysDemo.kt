package LanguagePractice.collection

fun main() {
    val alphabet = arrayOf("A","B","C","D")
    println("The size of the alphabet array is ${alphabet.size}")

    // We can add element in an array, but it will copy the old
    // array to a new with added element

    val updatedAlphabet = alphabet + "E"
    println("The size of the new alphabet array is ${updatedAlphabet.size}")
    println("The 2nd element in alphabet array is ${updatedAlphabet[1]}") // as any collection size starts with 0
    println("First element of updatedAlphabet is ${updatedAlphabet.first()}")
    println("Last element of updatedAlphabet is ${updatedAlphabet.last()}")
    println("Last index of updatedAlphabet is ${updatedAlphabet.lastIndex}")

    println("Is E exists in alphabet array : ${"E" in alphabet}")
    println("Is E exists in updated alphabet array : ${"E" in updatedAlphabet}")

}