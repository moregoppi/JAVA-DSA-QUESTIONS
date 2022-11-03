import java.util.Deque;
import java.util.LinkedList;

public class queueusingdeque { 
    static class Queue{
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty(){
            return deque.isEmpty();
        }

        public static void add(int data){
            deque.addLast(data);
        }

        public static int remove(){
            int t = deque.removeFirst();
            return t;
        }

        public static int peek(){
            return deque.peekFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
