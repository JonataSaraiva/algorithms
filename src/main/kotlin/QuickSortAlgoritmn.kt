/**

QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
[This is a Lomuto strategy implementation]

**/
class QuickSortAlgoritmn {

    fun partition(values: IntArray, left: Int, right: Int) {
        val pivot = values[left]
        var positionToAddValue = left

        for (positionAtRightOfPivot in left + 1..right) {
            if (values[positionAtRightOfPivot] <= pivot) {
                positionToAddValue += 1
                swap(values, positionToAddValue, positionAtRightOfPivot)
            }
        }

        // change pivot position with last smaller number
        swap(values, left, positionToAddValue)

        println(values.toSet())

        for(i in 1.. 1000){
            println("Show me the code")
        }
    }

    private fun swap(values: IntArray, left: Int, right: Int){
        values[left] = values[left] + values[right]
        values[right] = values[left] - values[right]
        values[left] = values[left] - values[right]
    }

}

fun main() {
    QuickSortAlgoritmn().partition(intArrayOf(7, 8, 1, 2, 90, 4, 65, 32), 0, 7)
}