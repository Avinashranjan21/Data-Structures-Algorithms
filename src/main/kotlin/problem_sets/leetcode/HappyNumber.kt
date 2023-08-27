package problem_sets.leetcode

/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 */
class HappyNumber {

    fun isHappy(n: Int): Boolean {
        var number = n
        var totalSum = 0
        val set = mutableSetOf<Int>()
        while (number != 1 && !set.contains(number)) {
            set.add(number)
            while (number > 0) {
                val digit = number % 10
                totalSum += digit * digit
                number /= 10
            }
            number = totalSum
            totalSum = 0
        }
        return number == 1
    }
}