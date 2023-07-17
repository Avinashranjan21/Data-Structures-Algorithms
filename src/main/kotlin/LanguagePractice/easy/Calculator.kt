package LanguagePractice.easy

// Write a program for calculator

fun main() {
    println("Welcome to the Kotlin Calculator")
    println("Please enter the first number of your choice")
    val firstNumber = readlnOrNull()!!.toInt() // This can cause number format exception if null is entered
    println("Please enter the second number of your choice")
    val secondNumber = readlnOrNull()!!.toInt() // This can cause number format exception if null is entered
    println("Please select the operator below \n" +
            "1-> Add\n" +
            "2-> Subtract\n" +
            "3-> Multiply\n" +
            "4-> Division")

    when(readlnOrNull()!!.toInt()){
        1 -> print("The sum of $firstNumber and $secondNumber is ${firstNumber + secondNumber}")
        2 -> print("The subtraction of $firstNumber and $secondNumber is ${firstNumber - secondNumber}")
        3 -> print("The multiplication of $firstNumber and $secondNumber is ${firstNumber * secondNumber}")
        4 -> print("The division of $firstNumber and $secondNumber is ${firstNumber / secondNumber}")
        else -> println("Wrong choice entered")
    }

}