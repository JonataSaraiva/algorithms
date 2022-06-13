/**
Challenge name: Two Sum II
Challenge from: Leet Code

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 **/

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val values = nums.indices.associateBy { nums[it] }

        values.forEach {
            val possibleNumber = target - it.key

            if(values.containsKey(possibleNumber) && values[possibleNumber] != it.value){
                return intArrayOf(it.value, values[possibleNumber]!!)
            } else if(values.containsKey(possibleNumber) && nums.count { num -> num == possibleNumber } == 2){
                return intArrayOf( nums.indexOfFirst { idx -> idx == possibleNumber }, nums.indexOfLast { idx -> idx == possibleNumber } )
            }
        }

        return intArrayOf()
    }

}

fun main() {
    val twoSum = TwoSum().twoSum(intArrayOf(2,7,11,15), 9)

    println(twoSum.toSet())
    println("Expected result: ${twoSum.contentEquals(intArrayOf(0,1))}")
}

