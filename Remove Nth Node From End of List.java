// 19. Remove Nth Node From End of List
// Medium
// 14.4K
// 597
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



// Solution 2:


/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Stack<Node> s = new Stack<>();
    	
    	Node temp = head;
    	while(temp != null){
    	    s.push(temp);
    	    temp = temp.next;
    	}
    	int count = 0;
    	Node ans = null;
    	while(count < n && !s.isEmpty()){
    	    ans = s.pop();
    	    count++;
    	}
    	if(count != n){
    	    return -1;
    	}
    	return ans.data;
    }
}
