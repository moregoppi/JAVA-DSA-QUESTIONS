// Rod Cutting
// MediumAccuracy: 60.66%Submissions: 66K+Points: 4
// Getting a High Paying Job Now Easier Than Today's Problem! Apply For Mega Job-A-Thon  

// Given a rod of length N inches and an array of prices, price[]. price[i] denotes the value of a piece of length i. Determine the maximum value obtainable by cutting up the rod and selling the pieces.

// Note: Consider 1-based indexing.

// Example 1:

// Input:
// N = 8
// Price[] = {1, 5, 8, 9, 10, 17, 17, 20}
// Output:
// 22
// Explanation:
// The maximum obtainable value is 22 by 
// cutting in two pieces of lengths 2 and 
// 6, i.e., 5+17=22.
// Example 2:

// Input:
// N=8
// Price[] = {3, 5, 8, 9, 10, 17, 17, 20}
// Output: 
// 24
// Explanation: 
// The maximum obtainable value is 
// 24 by cutting the rod into 8 pieces 
// of length 1, i.e, 8*3=24. 
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function cutRod() which takes the array A[] and its size N as inputs and returns the maximum price obtainable.

// Expected Time Complexity: O(N2)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 ≤ N ≤ 1000
// 1 ≤ Ai ≤ 105




class Solution{
    public static int helper(int price[], int index, int n, int[][] dp){
        if(index == 0){
            return n * price[0];
        }
        
        if (dp[index][n] != -1) {
            return dp[index][n];
        }
        
        int notcut = helper(price, index-1, n, dp);
        int cut = Integer.MIN_VALUE;
        int rod_length = index + 1;
        if(rod_length <= n){
            cut = price[index] + helper(price, index, n-rod_length, dp);
        }
        return dp[index][n] = Math.max(cut, notcut);
    }
    public int cutRod(int price[], int n) {
        //code here
        int index = n - 1;
        int dp[][] = new int[n][n+1];
        for (int i = 0; i < n; i++) {
             Arrays.fill(dp[i], -1);
        }
        return helper(price, index, n, dp);
    }
}
