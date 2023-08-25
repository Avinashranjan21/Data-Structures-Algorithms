package problem_sets.leetcode

import kotlin.math.abs

/**
 * You are given a positive integer array nums.
 *
 * The element sum is the sum of all the elements in nums.
 * The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
 * Return the absolute difference between the element sum and digit sum of nums.
 *
 * Note that the absolute difference between two integers x and y is defined as |x - y|.
 */
class ElementSumDigitSum {

    fun differenceOfSum(nums: IntArray): Int {
        var elementSum = 0
        var digitSum = 0
        for (i in nums) {
            elementSum += i
            for (j in 0..i.toString().lastIndex){
                digitSum += i.toString()[j].toString().toInt()
            }
        }
        return abs(elementSum - digitSum)
    }
}