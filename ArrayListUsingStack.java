import java.util.*;
public class stackusingarraylist {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //checking arraylist is empty or not
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push fuction (for adding new data at the top of stack)
        public static void push(int data){
            list.add(data);
        }

        //pop function(for delete top data from stack)
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek function (for check top data in stack)
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
