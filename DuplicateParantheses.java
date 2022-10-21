// Given a balanced expression, find if it contains duplicate parenthesis or not. A set of parenthesis are duplicate 
// if the same subexpression is surrounded by multiple parenthesis.

// Below expressions have duplicate parenthesis - 
// ((a+b)+((c+d)))
// The subexpression "c+d" is surrounded by two
// pairs of brackets.

// (((a+(b)))+(c+d))
// The subexpression "a+(b)" is surrounded by two 
// pairs of brackets.

// (((a+(b))+c+d))
// The whole expression is surrounded by two 
// pairs of brackets.

// ((a+(b))+(c+d))
// (b) and ((a+(b)) is surrounded by two
// pairs of brackets.

// Below expressions don't have any duplicate parenthesis -
// ((a+b)+(c+d)) 
// No subexpression is surrounded by duplicate
// brackets.



import java.util.Stack;

public class duplicatesparantheses { 
    public static boolean isDuplicate(String str){
        Stack<Character> s =new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();   //here we are deleting +,-,* and characters
                    count++;
                }
                if(count < 1){
                    return true;  //if their is duplicate
                }else{
                    s.pop(); //here we are deleting the opening parantheses
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str));
    }
}
