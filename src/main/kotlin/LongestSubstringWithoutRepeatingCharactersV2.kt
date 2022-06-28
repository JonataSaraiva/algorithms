import kotlin.math.max

class LongestSubstringWithoutRepeatingCharactersV2 {

    fun calc(string: String): Int {
        if(string == "")
            return 0

        var foundChars = hashSetOf<Char>()
        var maxCount = 0
        var left = 0
        var right = 0

        while (right < string.length){
            while(foundChars.contains(string[right])){
                foundChars.remove(string[left++])
            }
            foundChars.add(string[right++])
            maxCount = max(maxCount, right - left)
        }

        return maxCount
    }

}

fun main() {
    val result = LongestSubstringWithoutRepeatingCharactersV2().calc("pwwkew")
    println("Result: $result")
    println("Expected result: ${result == 3}")
}