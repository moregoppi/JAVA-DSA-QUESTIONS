// Reverse words in a given string
// EasyAccuracy: 56.08%Submissions: 244K+Points: 2
// Last Week Of Job Fair 2023. Explore Unlimited Opportunities Now!
// Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

// Example 1:

// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i
// Example 2:

// Input:
// S = pqr.mno
// Output: mno.pqr
// Explanation: After reversing the whole
// string , the input string becomes
// mno.pqr

// Your Task:
// You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.' 


// Expected Time Complexity: O(|S|)
// Expected Auxiliary Space: O(|S|)


// Constraints:
// 1 <= |S| <= 105




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String[] arr = null;
        String s = S.replaceAll("\\.", " ");
        arr = s.split(" ");
        
        S = "";
        
        for(int i=arr.length-1; i>=0; i--){
            S += arr[i];
            if(i > 0){
                S += ".";
            }
        }
        
        return S;
    }
}
