package problem_sets.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import problem_sets.leetcode.RunningSum1dArray

class RunningSum1dArrayTest {

    @Test
    fun runningSum() {
        val runningSum = RunningSum1dArray()
        val returnedArray = runningSum.runningSum(intArrayOf(1, 2, 3, 4))
        val resultExpected = intArrayOf(1, 3, 6, 10)
        for (i in 0..returnedArray.lastIndex) {
            assertEquals(resultExpected[i], returnedArray[i])
        }
    }
}