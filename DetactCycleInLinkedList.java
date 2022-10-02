public class detactcycle {
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

    public static boolean detactit(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next;  //+2
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node temp = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        Node temp3 = new Node(4);
        temp.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp;
        System.out.println(detactit());
    }
}
