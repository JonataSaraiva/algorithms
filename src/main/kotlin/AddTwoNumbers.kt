/**

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Resolution complexity: O(N)
**/

class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var lastNode = ListNode(0)
        val head = lastNode
        var remainder = 0
        var l1ref = l1
        var l2ref = l2

        while(l1ref != null || l2ref != null || remainder != 0){
            val node = ListNode(0)
            val sum = (l1ref?.`val` ?: 0) + (l2ref?.`val` ?: 0) + remainder

            if(sum > 9){
                node.`val` = sum % 10
                remainder = sum / 10
            } else {
                node.`val` = sum
                remainder = 0
            }

            lastNode.next = node
            lastNode = node

            l1ref = l1ref?.next
            l2ref = l2ref?.next
        }

        return head.next
    }

}

data class ListNode(var `val`: Int, var next: ListNode? = null)

fun main() {
    val l1 = ListNode(9, ListNode(4, ListNode(3)))
    val l2 = ListNode(9, ListNode(6, ListNode(4)))

    val result = AddTwoNumbers().addTwoNumbers(l1, l2)
    println("Result: $result")
}