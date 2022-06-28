import kotlin.math.max

class LongestSubstringWithoutRepeatingCharacters {

    fun calc(string: String): Int {
        if(string == "")
            return 0

        var longestStringCounter = 0

        string.forEachIndexed { index, char ->
            val charsFound = mutableListOf<String>()
            var stringWithoutRepeatingCounter = 0

            for (elements in index until string.length){
                val charToAnalyse = string[elements].toString()

                if(!charsFound.contains(charToAnalyse)){
                    charsFound.add(charToAnalyse)
                    stringWithoutRepeatingCounter += 1
                    longestStringCounter = max(longestStringCounter, stringWithoutRepeatingCounter)
                } else {
                    break
                }
            }
        }

        return longestStringCounter
    }

}

fun main() {
    val result = LongestSubstringWithoutRepeatingCharacters().calc("pwwkew")
    println("Result: $result")
    println("Expected result: ${result == 3}")
}