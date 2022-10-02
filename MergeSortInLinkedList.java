public class mergesort { 
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printll(){
        if(head == null){
            System.out.println("null");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  //mid
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        while(head1 != null && head2 != null){
            if(head1.data <=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return  mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        //find mid
        Node mid = getMid(head);

        //after dividing linked list into two parts left head and right head
        Node righthead = mid.next;
        mid.next = null;
        Node lefthead = head;

        Node newleft = mergeSort(lefthead);
        Node newRight = mergeSort(righthead);

        //merge
        return merge(newleft, newRight);
    }
    public static void main(String[] args) {
        mergesort ll = new mergesort();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(12);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.printll();
        ll.head = ll.mergeSort(ll.head);
        ll.printll();
    }
}
