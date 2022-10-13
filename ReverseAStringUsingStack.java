import java.util.Stack;

public class reverseastringusingstack {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abc";
        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        String str1 = "";
        while(!s.empty()){
            str1+=s.peek();
            s.pop();
        }
        System.out.println(str1);
    }
}
