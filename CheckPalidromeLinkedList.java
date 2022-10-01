public class checkpalidrome {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;  //taking +1 steps
            fast = fast.next.next;   //taking +2 steps
        }
        return slow;
    }
    public boolean checkPalidrom(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1:- find middle
        Node middleNode = middleNode(head);

        //step 2:- Reverse right half
        Node previous = null;
        Node current = middleNode;
        Node next;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        Node right = previous;
        Node left = head;

        //step 3:- checking left and right 
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        checkpalidrome ll = new checkpalidrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(3);

        System.out.println("This is "+ll.checkPalidrom()+" palidrome linked list");
    }
}
