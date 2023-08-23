package problem_sets.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidAnagramTest {

    @Test
    fun isAnagram() {
        val validAnagram = ValidAnagram()
        assertTrue(validAnagram.isAnagram("anagram","nagaram"))
        assertFalse(validAnagram.isAnagram("rat","car"))
        assertFalse(validAnagram.isAnagram("rata","car"))
        assertTrue(validAnagram.isAnagram("aaabbb","bbbaaa"))
    }
}