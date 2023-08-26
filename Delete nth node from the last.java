// 19. Remove Nth Node From End of List
// Medium
// 16.9K
// 699
// Companies
// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
 

// Follow up: Could you do this in one pass?



// Using two pointer
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode firstpointer = head;
        ListNode secondpointer = head;

        for(int i=1; i<=n; i++){
            firstpointer = firstpointer.next;
        }

        if(firstpointer == null){
            ListNode temp = head.next;
            head.next = null;
            head = null;
            return temp;
        }

        while(firstpointer.next != null){
            firstpointer = firstpointer.next;
            secondpointer = secondpointer.next;
        }

        ListNode temp = secondpointer.next;
        secondpointer.next = temp.next;
        temp = null;
        return head;
    }
}





// using doublw iteration
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return head;
        }
        int i = 1;
        int iToFind = size - n;
        ListNode previous = head;
        while(i < iToFind){
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return head;
    }
}
