// 5. Longest Palindromic Substring
// Medium
// 23.2K
// 1.4K
// Companies
// Given a string s, return the longest 
// palindromic
 
// substring
//  in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"



class Solution {
    public static boolean palidromString(String s, int left, int right){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1){
            return s;
        }
        for(int len = n; len>=2; len--){
            for(int left=0; left+len <= n; left++){
                int right = left + len - 1;
                if(palidromString(s, left, right)){
                    return s.substring(left, right+1);
                }
            }
        }
        return s.substring(0,1);
    }
}
