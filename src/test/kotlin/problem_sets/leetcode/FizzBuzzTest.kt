package problem_sets.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    fun fizzBuzz() {
        val fizzBuzz = FizzBuzz()
        verifyResultArray(listOf("1", "2", "Fizz"), fizzBuzz.fizzBuzz(3))
        verifyResultArray(listOf("1", "2", "Fizz", "4", "Buzz"), fizzBuzz.fizzBuzz(5))
        verifyResultArray(
            listOf(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
            ), fizzBuzz.fizzBuzz(15)
        )
    }

    private fun verifyResultArray(expected: List<String>, result: List<String>) {
        assertEquals(expected.size, result.size)
        for ((index, value) in expected.withIndex()) {
            assertEquals(value, result[index])
        }
    }
}