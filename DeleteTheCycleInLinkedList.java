public class removecycle {
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

    public static void removeIt(){
        //Step 1:-detact cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
            }
        }
        //Step 2:- Checking if cycle is not present then just return
        if(cycle == false){
            return;
        }
        //Step 3:- make slow a head again and increase slow and fast by one
        slow = head;
        Node previous = null;
        while(slow != fast){
            previous = fast;
            slow = slow.next;
            fast = fast.next;
        }

        previous.next = null;

    }
    public static void main(String[] args) {
        
    }
}
