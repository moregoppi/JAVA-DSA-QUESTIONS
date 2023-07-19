// Longest Palindromic Subsequence
// MediumAccuracy: 56.57%Submissions: 63K+Points: 4
// POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
// Registered
// Given a String, find the longest palindromic subsequence.

// Example 1:

// Input:
// S = "bbabcbcab"
// Output: 7
// Explanation: Subsequence "babcbab" is the
// longest subsequence which is also a palindrome.
// Example 2:

// Input: 
// S = "abcd"
// Output: 1
// Explanation: "a", "b", "c" and "d" are
// palindromic and all have a length 1.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function longestPalinSubseq() which takes the string S as input and returns an integer denoting the length of the longest palindromic subsequence of S.

// Expected Time Complexity: O(|S|*|S|).
// Expected Auxiliary Space: O(|S|*|S|).

// Constraints:
// 1 ≤ |S| ≤ 1000

class Solution
{
    public int longestPalinSubseq(String s)
    {
        //code here
        int n = s.length();
        int[][] dp = new int[n][n];
        
        for(int i=0; i<n; i++){
            dp[i][i] = 1;
        }
        
        for(int i=2; i<=n; i++){
            for(int j=0; j<n-i+1; j++){
                int k = j + i - 1;
                if(s.charAt(j) == s.charAt(k) && i == 2){
                    dp[j][k] = 2;
                }else if(s.charAt(j) == s.charAt(k)){
                    dp[j][k] = dp[j+1][k-1] + 2;
                }else{
                    dp[j][k] = Math.max(dp[j][k-1], dp[j+1][k]);
                }
            }
        }
        return dp[0][n-1];
    }
}
