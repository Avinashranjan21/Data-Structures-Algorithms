package problem_sets.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class HappyNumberTest {

    @Test
    fun isHappy() {
        val happyNumber = HappyNumber()
        assertTrue(happyNumber.isHappy(19))
        assertTrue(happyNumber.isHappy(7))
        assertFalse(happyNumber.isHappy(2))
    }
}