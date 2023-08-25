package problem_sets.leetcode

/**
 * Given an integer array nums of length n, you want to create an array answer of length 2n where
 * ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 * Specifically, the answer is the concatenation of two numbers arrays.
 */
class ConcatenationArray {
    fun getConcatenation(nums: IntArray): IntArray {
        return nums + nums
    }
}