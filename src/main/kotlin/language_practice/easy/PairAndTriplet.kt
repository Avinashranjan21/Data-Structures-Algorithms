package language_practice.easy

/**
 * A Pair is a simple data class that holds two values together.
 * It's created using the two extension function, which is available
 * on any object. Here's a basic explanation
 *
 * A Triple is similar to a Pair, but it holds three values together.
 */

fun main() {
    val fullName = Pair("Avinash", "Pandey")
    val (firstName, lastname) = fullName
    val accountNumber = 123456789
    val creditCardNumber = Triple("123456789", "12/12/20", "123")
    val accountDetails = Triple(fullName, accountNumber, creditCardNumber)
    println("Account holder first name is $firstName and last name is $lastname")
    println("Account details of ${fullName.first} is account number is ${accountDetails.second}")
    println("Credit card details of ${fullName.first} is below \n ${creditCardNumber.first} \n ${creditCardNumber.second} \n ${creditCardNumber.third}")
}