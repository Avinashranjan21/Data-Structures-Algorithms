package problem_sets.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NumberEmployeesTargetTest {

    @Test
    fun numberOfEmployeesWhoMetTarget() {
        val numberEmployeesTarget = NumberEmployeesTarget()
        assertEquals(3, numberEmployeesTarget
            .numberOfEmployeesWhoMetTarget(intArrayOf(0, 1, 2, 3, 4), 2))
        assertEquals(0, numberEmployeesTarget
            .numberOfEmployeesWhoMetTarget(intArrayOf(5,1,4,2,2), 6))
    }
}