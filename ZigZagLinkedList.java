public class zigzag {
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
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printll(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void zigzag(){
        //step 1:- find mid(mid is last node of first half)
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //Step 2:- reverse the second half of linked list
        Node current = mid.next;
        mid.next = null;
        Node previous = null;
        Node next;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        Node left = head;
        Node right = previous;
        Node nextLeft , nextRight;
        while(left != null && right != null){
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }
    public static void main(String[] args) {
        zigzag ll = new zigzag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printll();
        ll.zigzag();
        ll.printll();
    }
}
