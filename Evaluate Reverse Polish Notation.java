// 150. Evaluate Reverse Polish Notation
// Medium
// 4.7K
// 790
// Companies
// Evaluate the value of an arithmetic expression in Reverse Polish Notation.

// Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

// Note that division between two integers should truncate toward zero.

// It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.

 

// Example 1:

// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9
// Example 2:

// Input: tokens = ["4","13","5","/","+"]
// Output: 6
// Explanation: (4 + (13 / 5)) = 6
// Example 3:

// Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
// Output: 22
// Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
// = ((10 * (6 / (12 * -11))) + 17) + 5
// = ((10 * (6 / -132)) + 17) + 5
// = ((10 * 0) + 17) + 5
// = (0 + 17) + 5
// = 17 + 5
// = 22



solution 1:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String token[] = {"2","1","+","3","*"};
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<token.length; i++){
		    if(token[i] == "+"){
		        s.push(s.pop() + s.pop());
		    }else if(token[i] == "*"){
		        s.push(s.pop() * s.pop());
		    }else if(token[i] == "-"){
		        int b = s.pop();
		        int a = s.pop();
		        s.push(b-a);
		    }else if(token[i] == "/"){
		        int b = s.pop();
		        int a = s.pop();
		        s.push(b / a);
		    }
		    else{
		        s.push(Integer.valueOf(token[i]));
		    }
		}
		System.out.println(s.pop());
	}
}


solution:

class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0 || tokens == null){
            return -1;
        }
        Stack<Integer> s = new Stack<>();
        for(String token : tokens){
		    if(token.equals("+")){
		        s.push(s.pop() + s.pop());
		    }else if(token.equals("*")){
		        s.push(s.pop() * s.pop());
		    }else if(token.equals("-")){
		        int b = s.pop();
		        int a = s.pop();
		        s.push(a-b);
		    }else if(token.equals("/")){
		        int b = s.pop();
		        int a = s.pop();
		        s.push(a / b);
		    }
		    else{
		        s.push(Integer.valueOf(token));
		    }
		}
        return s.pop();
    }
}
