//Delete N Nodes After M Nodes of a Linked List We have a linked list and two integers M and N. Traverse the linked list such that you retain
//M nodes the n delete next N nodes, continue the same till end of the linkedlist. 
//DifficultyLevel:Rookie.
//Sample Input 1: M=2 N=2    LL: 1->2->3->4->5->6->7->8Sample Output 1: 1->2->5->6
//Sample Input 2: M=3 N=2    LL: 1->2->3->4->5->6->7->8->9->10
//Sample Output 2: 1->2->3->6->7->8
import java.util.*;
public class deletennodesafterm {
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

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
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

    public static void newLL(int n, int m){
        Node current = head;
        Node temp;
        while(current != null){
            int count;
            for(count = 1; count < m; count++){
                current = current.next;
            }
            if(current == null && current.next == null){
                return;
            }
            temp = current.next;
            for(count = 1; count < n; count++){
                temp = temp.next;
            }
            current.next = temp.next;
            current = temp.next;
        }
    }
    public static void main(String[] args) {
        deletennodesafterm ll = new deletennodesafterm();
        int m = 3;
        int n = 1;
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        ll.newLL(n, m);
        ll.print();
    }
}
