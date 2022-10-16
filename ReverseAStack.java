import java.util.*;
public class reverseastack {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseAstack(Stack<Integer> s){
        if(s.empty()){
            return;
        }

        int top = s.pop();
        reverseAstack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //before reversed:- 3, 2, 1
        reverseAstack(s);
        System.out.println("stack after reversed");
        //1, 2, 3
        printStack(s);
    }   
}
