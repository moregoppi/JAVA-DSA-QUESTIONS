import java.util.Stack;

public class Main {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //this function is for queue
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //this dunction is for queue
        public static void add(int data){
            //(i)here we are transfering s1 stack's elements in s2 stack's
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            //(ii)here we are add new data in s1 stack's
            s1.push(data);

            //(iii)here we are transfering s2 stack's element in s1's stack element just above latest add element
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove funtion for queue
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        //peek function for queue
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }   
}
