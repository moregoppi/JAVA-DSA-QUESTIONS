// Modify Linked List-1
// MediumAccuracy: 78.5%Submissions: 9K+Points: 4
// Lamp
// You can earn more Geekbits by participating in GFG Weekly Coding Contest  

// Given a singly linked list containing N nodes. Modify the Linked list as follows:

// 1. Modify the value of the first half nodes such that 1st node's new value is equal to the value of the last node minus the first node's current value, 2nd node's new value is equal to the second last nodes value minus 2nd nodes current value, likewise for first half nodes.
// 2. Replace the second half of nodes with the initial values of the first half nodes(values before modifying the nodes).
// 3. If N is odd then the value of the middle node remains unchanged.

// Example 1:

// Input:
// N = 5
// linked list = 10 -> 4 -> 5 -> 3 -> 6
// Output:
// -4 -1 5 4 10
// Explanation:
// For first half nodes modified list will be:
// -4 -> -1 -> 5 -> 3 -> 6
// For second half nodes modified list will be:
// -4 -> -1 -> 5 -> 4 -> 10
// Example 2:

// Input:
// N = 6
// linked list = 2 -> 9 -> 8 -> 12 -> 7 -> 10
// Output:
// 8 -2 4 8 9 2
// Explanation:
// After modifying the linked list as required,
// we have a new linked list containing the elements as
// 8 -> -2 -> 4 -> 8 -> 9 -> 2.
// YourTask:
// The task is to complete the function modifyTheList() which should modify the list as required.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 <= N <= 105
// -105  <= Node->data <= 105



//User function Template for Java
class Solution
{
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast != null){
            slow = slow.next;
        }
        
        return slow;
    }
    public static Node modifyTheList(Node head)
    {
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        int count = 0;
        while(temp != null){
            s.push(temp.data);
            temp = temp.next;
            count++;
        }
        Node mid = findMid(head);
        Node temp2 = head;
        Node ans = head;
        while(!s.isEmpty() && temp2.next != mid && count % 2 != 0){
            temp2.data = s.peek() - temp2.data;
            temp2 = temp2.next;
            s.pop();
        }
        
        while(!s.isEmpty() && temp2 != mid && count % 2 == 0){
            temp2.data = s.peek() - temp2.data;
            temp2 = temp2.next;
            s.pop();
        }
        
        while(temp2 != null){
            temp2.data = s.peek();
            s.pop();
            temp2 = temp2.next;
        }
        return head;
    }
    
}
