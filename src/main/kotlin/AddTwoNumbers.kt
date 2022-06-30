import kotlin.math.max

class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var remainder = 0
        var listNode : ListNode = ListNode(0)
        var l1ref = l1
        var l2ref = l2

        while(l1ref != null || l2ref != null || remainder != 0){
            val sum = (l1ref?.`val` ?: 0) + (l2ref?.`val` ?: 0) + remainder

            if(sum > 9){

            } else {
                val node = ListNode(sum)
                listNode.next = node
                listNode = node
            }

            l1ref = l1ref?.next
            l2ref = l2ref?.next
        }

        return listNode.next
    }

}

data class ListNode(var `val`: Int, var next: ListNode? = null)

fun main() {
    val l1 = ListNode(1, ListNode(2))
    val l2 = ListNode(3, ListNode(4))


    val result = AddTwoNumbers().addTwoNumbers(l1, l2)
    println("Result: $result")
//    println("Expected result: ${result == 3}")
}