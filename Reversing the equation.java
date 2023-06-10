// Reversing the equation
// EasyAccuracy: 58.61%Submissions: 29K+Points: 2
// Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 7 LPA  

// Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
// It is guaranteed that the given equation is valid, and there are no leading zeros.

// Example 1:

// Input:
// S = "20-3+5*2"
// Output: 2*5+3-20
// Explanation: The equation is reversed with
// numbers remaining the same.
// Example 2:

// Input: 
// S = "5+2*56-2/4"
// Output: 4/2-56*2+5
// Explanation: The equation is reversed with
// numbers remaining the same.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function reverseEqn() which takes the string S representing the equation as input and returns the resultant string representing the equation in reverse.

// Expected Time Complexity: O(|S|).
// Expected Auxiliary Space: O(|S|).

// Constraints:
// 1<=|S|<=105
// The string contains only the characters '0' - '9', '+', '-', '*', and '/'.



//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        String str = "", result = "";
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '-' || ch == '+' || ch == '*' || ch == '/'){
                result = ch + str + result;
                str = "";
            }else{
                str = str + ch;
            }
        }
        result = str + result;
        return result;
    }
}





//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '-' || ch == '+' || ch == '*' || ch == '/'){
                String r = result.toString();
                result.setLength(0);
                result.append(ch);
                result.append(str);
                result.append(r);
                str.setLength(0);
            }else{
                str.append(ch);
            }
        }
        result.insert(0, str);
        return result.toString();
    }

}
