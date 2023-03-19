

public class Doublylinkedlist {
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
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Dll is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.previous = null;
        size--;

    }

    public void removeLast(){
        if(head == null){
            System.out.println("Dll is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        tail = tail.previous;
        tail.next = null;

    }

    public void printdll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Doublylinkedlist dll = new Doublylinkedlist();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.printdll();
        dll.removeFirst();
        dll.printdll();
        dll.addLast(11);
        dll.printdll();
        System.out.println(dll.size);
        dll.removeLast();
        dll.printdll();
    }
}
