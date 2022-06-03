/**
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

**/
class LongestCommonPrefix {
    fun verify(words: Array<String>): String {
        words.sortBy { it.length } // improvement to avoid unnecessary iterates
        val token = words.first()

        for (i in token.length downTo 0){
            words.map { it.take(i) }
                .filter { it == token.take(i) }
                .takeIf { it.size == words.size }?.let {
                    return it.first()
                }
        }

        return ""
    }
}

fun main() {
    val prefix = LongestCommonPrefix().verify(arrayOf("flower", "flow", "flight"))
    println(prefix)
}