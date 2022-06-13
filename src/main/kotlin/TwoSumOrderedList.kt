/**
Challenge name: Two Sum II - Input Array Is Sorted
Challenge from: Leet Code

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.

Example:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
**/
class TwoSumOrderedList {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var pointerBegin = 0
        var pointerEnd = nums.size - 1

        while(pointerBegin < pointerEnd) {
            val sum = nums[pointerBegin] + nums[pointerEnd]

            if(sum == target)
                return intArrayOf(pointerBegin +1, pointerEnd +1)
            else if(sum < target)
                pointerBegin += 1
            else
                pointerEnd -= 1
        }

        return intArrayOf()
    }

}

fun main() {
    val twoSum = TwoSumOrderedList().twoSum(intArrayOf(2,7,11,15), 9)

    println(twoSum.toSet())
    println("Expected result: ${twoSum.contentEquals(intArrayOf(1,2))}")
}

