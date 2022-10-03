import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class reversedll {
    public class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
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
        newNode.previous = tail;
        tail = newNode;
    }
    public void printdll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void reversedll(){
        Node current = head;
        Node previous = null;
        Node next;
        while(current != null){
            next = current.next;
            current.next = previous;
            current.previous = next;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public static void main(String[] args) {
        reversedll dll = new reversedll();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.printdll();
        dll.reversedll();
        dll.printdll();
    }
}
