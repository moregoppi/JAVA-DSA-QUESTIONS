// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false

import java.util.Stack;

public class validparantheses {
    public static boolean checkit(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.empty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')
                || (s.peek() == '{' && ch == '}')
                || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String parantheses = "({[]})(";
        System.out.println(checkit(parantheses));
    }
}
