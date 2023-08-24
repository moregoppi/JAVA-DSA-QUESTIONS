// Multiply two strings
// MediumAccuracy: 20.06%Submissions: 152K+Points: 4
// Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

// Given two numbers as strings s1 and s2. Calculate their Product.

// Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers.

// Example 1:

// Input:
// s1 = "0033"
// s2 = "2"
// Output:
// 66
// Example 2:

// Input:
// s1 = "11"
// s2 = "23"
// Output:
// 253
// Your Task: You don't need to read input or print anything. Your task is to complete the function multiplyStrings() which takes two strings s1 and s2 as input and returns their product as a string.

// Expected Time Complexity: O(n1* n2)
// Expected Auxiliary Space: O(n1 + n2); where n1 and n2 are sizes of strings s1 and s2 respectively.

// Constraints:
// 1 ≤ length of s1 and s2 ≤ 103



//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        int sign = 1;
        
        if(s1.charAt(0) == '-'){
            sign = -1;
            s1 = s1.substring(1);
        }
        if(s2.charAt(0) == '-'){
            sign = (sign) * (-1);
            s2 = s2.substring(1);
        }
        int n1 = s1.length();
        int n2 = s2.length();
        
        if(n1 == 0 || n2 == 0){
            return "0";
        }
        
        int[] result = new int[n1 + n2];
        
        int i_n1 = 0;
        int i_n2 = 0;
        
        for(int i=n1-1; i>=0; i--){
            int carry = 0;
            int num1 = s1.charAt(i) - '0';
            
            i_n2 = 0;
            
            for(int j=n2-1; j>=0; j--){
                int num2 = s2.charAt(j) - '0';
                
                int sum = num1*num2 + result[i_n1 + i_n2] + carry;
                
                carry = sum/10;
                
                result[i_n1 + i_n2] = sum % 10;
                
                i_n2++;
            }
            if(carry > 0){
                result[i_n1 + i_n2] += carry;
            }
            i_n1++;
        }
        
        int i = result.length- 1;
        while (i>=0 && result[i] == 0){
           i--;
        }
        if (i == -1){
           return "0";
        }
        StringBuilder s = new StringBuilder();
        while (i >= 0){
            s.append(Integer.toString(result[i]));
            i--;
        }
            
        if (sign == -1){
            s.insert(0, '-');
        }
        return s.toString();
    }
}
