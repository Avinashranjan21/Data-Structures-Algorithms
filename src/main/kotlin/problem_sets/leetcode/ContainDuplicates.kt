package problem_sets.leetcode

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
 *
 * Given an integer array numbs, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
class ContainDuplicates {
    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false
        val numSet = mutableSetOf<Int>()
        nums.forEach {
            if (numSet.contains(it)){
                return true;
            }
            numSet.add(it)
        }
        return false
    }
}