public class interactivesearch {
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
    public void print(){
        Node temp = head;
        int i=0;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int search(int key){   //O(n)
        int i=0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //with the help of recursion
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index=helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public int recursiveSearch(int key){
        return helper(head , key);
    }
    public static void main(String[] args) {
        interactivesearch ll= new interactivesearch();
        ll.addLast(12);
        ll.addLast(11);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.recursiveSearch(1));
        System.out.println(ll.recursiveSearch(14));
    }
}
