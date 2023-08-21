package problem_sets.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SumMultiplesTest {

    @Test
    fun sumOfMultiples() {
        val sumMultiples = SumMultiples()
        assertEquals(21, sumMultiples.sumOfMultiples(7))
        assertEquals(40, sumMultiples.sumOfMultiples(10))
        assertEquals(30, sumMultiples.sumOfMultiples(9))
    }
}