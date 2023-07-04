package LanguagePractice

fun main() {
    println("Hello World")
    var greeting: String = "Hello Kotlin" // There is no need to define the type explicitly it is added just for example
    println(greeting)

    /**
     * “Kotlin urges us to use immutable data as much as possible.
     * Immutable variables in Kotlin are called values and use the
     * val keyword:”
     *
     * Excerpt From
     * Kotlin Design Patterns and Best Practices - Second Edition
     * Alexey Soshin
     * This material may be protected by copyright.
     * */

    val myNewGreeting = "Hi"
    // myNewGreeting = "Hello"  “Val cannot be reassigned”

    val a = 1000
    val b = 1000
    println("Is a equals to b ${a == b}")
    println("Is a equals to b is having same reference = ${a === b}")

    // calling a function
    getGreeting("Avinash Pandey")

    // Function that return some value
    println("Sum of two number 2 and 3 is ${addTwoNumber(2, 3)}")
}

fun getGreeting(name : String){
    println("Hi $name")
}

fun addTwoNumber(numberOne : Int, numberTwo: Int) : Int{
    return numberOne + numberTwo
}