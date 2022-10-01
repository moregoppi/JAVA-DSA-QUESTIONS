//we have to delete the nth node from last in a linked list
public class deletenthnodefromlast { 
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
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteThatNode(int n){
        int size=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }

        int i=1;
        int itofind = size - n;
        Node previous = head;
        while(i < itofind){
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        deletenthnodefromlast ll = new deletenthnodefromlast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.deleteThatNode(3);
        ll.print();
    }    
}
