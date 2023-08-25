package problem_sets.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ElementSumDigitSumTest {

    @Test
    fun differenceOfSum() {
        val elementSumDigitSum = ElementSumDigitSum()
        assertEquals(9, elementSumDigitSum.differenceOfSum(intArrayOf(1, 15, 6, 3)))
        assertEquals(0, elementSumDigitSum.differenceOfSum(intArrayOf(1,2,3,4)))
    }
}