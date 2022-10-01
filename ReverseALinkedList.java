public class reverselinkedlist {
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

    public void reverseLL(){
        Node previous = null;
        Node current = tail = head;
        Node next;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public void print(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        reverselinkedlist ll = new reverselinkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println("Before reversing linked list");
        ll.print();
        ll.reverseLL();
        System.out.println("after reverse linked list");
        ll.print();
    }    
}
