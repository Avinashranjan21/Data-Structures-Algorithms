package ProblemSets.LeetCode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import problem_sets.leetcode.RunningSum1dArray

class RunningSum1dArrayTest {

    @Test
    fun runningSum() {
        val runningSum = RunningSum1dArray()
        val returnedArray = runningSum.runningSum(intArrayOf(1,2,3,4))
        val resultExpected = intArrayOf(1,3,6,10)
        assertEquals(resultExpected[0], returnedArray[0])
        assertEquals(resultExpected[1], returnedArray[1])
        assertEquals(resultExpected[2], returnedArray[2])
        assertEquals(resultExpected[3], returnedArray[3])
    }
}