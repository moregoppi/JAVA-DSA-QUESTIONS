// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. 
//Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.


import java.util.*;
public class addtwoll {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");                
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int listToInteger(Node head){
        int num = 0;
        Node temp = head;
        while(temp != null){
            int digit = temp.data;
            num = 10*num + digit;
            temp = temp.next;
        }
        return num;
    }

    public static void main(String[] args) {
        addtwoll ll = new addtwoll();

        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);
        ll.print(head1);
        int head1int = listToInteger(head1);
        System.out.println(head1int);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);
        ll.print(head2);
        int head2int = listToInteger(head2);
        System.out.println("First linked list after reversing"+head2int);

        int newint = head1int + head2int;
        System.out.println("Second linked list after reversing"+newint);

        LinkedList<Integer> newll = new LinkedList<>();
        for(int i=0; i<newint; i++){
            int digit = newint % 10;
            if(newint == 0){
                break;
            }
            newll.addLast(digit);
            newint = newint / 10;
        }
        System.out.println("Final linked list");
        System.out.println(newll);
        
    }
}



//Leetcode solution
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        while(p != null || q != null){
            int x = (p != null)? p.val:0;
            int y = (q != null)? q.val:0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
