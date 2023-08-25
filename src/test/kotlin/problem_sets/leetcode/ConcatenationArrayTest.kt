package problem_sets.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConcatenationArrayTest {

    @Test
    fun getConcatenation() {
        val concatenationArray = ConcatenationArray()
        val expectedArray = intArrayOf(1,2,1,1,2,1)
        val resultArray = concatenationArray.getConcatenation(intArrayOf(1,2,1))
        for (i in 0..expectedArray.lastIndex){
            assertEquals(expectedArray[i], resultArray[i])
        }
    }
}