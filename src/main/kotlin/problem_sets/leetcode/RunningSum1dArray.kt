package problem_sets.leetcode

class RunningSum1dArray {
    fun runningSum(nums: IntArray): IntArray {
        var lastSum = 0
        val result = mutableListOf<Int>()
        for (num in nums){
            val currentSum = lastSum + num
            result.add(currentSum)
            lastSum = currentSum
        }
        return result.toIntArray()
    }
}