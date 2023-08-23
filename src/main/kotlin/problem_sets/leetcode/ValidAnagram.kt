package problem_sets.leetcode

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or
 * phrase, typically using all the original letters exactly once.
 */
class ValidAnagram { // TODO: Optimise the code below and use map default function
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val wordMap = mutableMapOf<Char, Int>()
        for (i in s.indices) {
            if (s[i] != t[i]) {
                if (wordMap[s[i]] == null) {
                    wordMap[s[i]] = 1
                } else if (wordMap.getValue(s[i]) == -1) {
                    wordMap.remove(s[i])
                } else {
                    wordMap[s[i]] = wordMap.getValue(s[i]).plus(1)
                }

                if (wordMap[t[i]] == null) {
                    wordMap[t[i]] = -1
                } else if (wordMap.getValue(t[i]) == 1) {
                    wordMap.remove(t[i])
                } else {
                    wordMap[t[i]] = wordMap.getValue(t[i]).minus(1)
                }
            }
        }
        return wordMap.isEmpty()
    }
}