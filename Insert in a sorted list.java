// Insert in a Sorted List
// EasyAccuracy: 31.37%Submissions: 87K+Points: 2
// You've Still got a chance to get on the Leaderboard! Register for GfG Weekly Coding Contest

// banner
// Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.

// Example 1:

// Input:
// LinkedList: 25->36->47->58->69->80
// data: 19
// Output: 
// 19 25 36 47 58 69 80
// Explanation:
// After inserting 19 the sorted linked list will look like the one in the output.
// Example 2:

// Input:
// LinkedList: 50->100
// data: 75
// Output: 
// 50 75 100
// Explanation:
// After inserting 75 the sorted linked list will look like the one in the output.
// Your Task:
// The task is to complete the function sortedInsert() which should insert the element in sorted Linked List and return the head of the linked list

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).




/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        
        Node newNode = new Node(key);
        
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data > key){
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if(prev != null){
            Node curr = prev.next;
            prev.next = newNode;
            newNode.next = curr;
        }else{
            newNode.next = head;
            head = newNode;
        }
        
        return head;
    }
}
