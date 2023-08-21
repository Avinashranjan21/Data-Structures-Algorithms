package ProblemSets.LeetCode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import problem_sets.leetcode.ContainDuplicates

class ContainDuplicatesTest {

    @Test
    fun containsDuplicate() {
        val containDuplicates = ContainDuplicates()
        Assertions.assertFalse(containDuplicates.containsDuplicate(intArrayOf(2,3,4,5)))
        Assertions.assertTrue(containDuplicates.containsDuplicate(intArrayOf(2,3,4,5,2)))
        Assertions.assertFalse(containDuplicates.containsDuplicate(intArrayOf()))
        Assertions.assertTrue(containDuplicates.containsDuplicate(intArrayOf(1,1,1,1,1)))
    }
}