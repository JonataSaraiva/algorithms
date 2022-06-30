/**

Sort Algorithm using BubbleSort strategy.
Resolution complexity: O(N²)

**/

class BubbleSortAlgorithm {

    fun sort(array: IntArray) : IntArray {
        for (i in array.size -1 downTo     1){
            for (j in 0 until i){
                val positionOne = array[j]
                val positionTwo = array[j + 1]

                if(positionOne > positionTwo){
                    array[j] = positionTwo
                    array[j+1] = positionOne
                }
            }
        }

        return array
    }

}

fun main() {
    val result = BubbleSortAlgorithm().sort(intArrayOf(6, 2, 5, 4, 3, 1)).toSet()
    println("Sorted List: $result")
    println("Was it the result expected? : ${result == setOf(1,2,3,4,5,6)}")
}