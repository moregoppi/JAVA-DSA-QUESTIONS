//Lists In a system the reare two singly linked list.By some programming error,the end node of one of the linked lists got linked to the second list,
//forming an inverted Y - shaped list. Write a program to get the point where two linked lists merge.
public class intersectionlinkdelist { 
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

    public static void printll(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void detactIt(Node head1, Node head2){
        while(head2 != null){
            Node temp = head1;
            while(temp != null){
                if(head2 == temp){
                    System.out.println("Intersecting point for both linked list is "+temp.data);
                    return;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
    }
    public static void main(String[] args) {
        intersectionlinkdelist ll = new intersectionlinkdelist();
        Node head1; 
        head1 = new Node(1);

        Node head2;
        head2 = new Node(4);

        Node newNode = new Node(2);
        head1.next = newNode;
        newNode = new Node(3);
        head1.next.next = newNode;
        newNode = new Node(5);
        head2.next = newNode;
        newNode = new Node(6);
        head2.next.next = newNode;
        head1.next.next.next = newNode;
        newNode = new Node(7);
        head1.next.next.next.next = newNode;
        head1.next.next.next.next.next = null;
        ll.printll(head1);
        ll.printll(head2);
        detactIt(head1, head2);

    }
    
}
