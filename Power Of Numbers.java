// Power Of Numbers
// MediumAccuracy: 20.22%Submissions: 202K+Points: 4
// POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
// Registered
// Given a number and its reverse. Find that number raised to the power of its own reverse.
// Note: As answers can be very large, print the result modulo 109 + 7.

// Example 1:

// Input:
// N = 2, R = 2
// Output: 4
// Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
// Example 2:

// Input:
// N = 12, R = 21
// Output: 864354781
// Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.
// Your Task:
// You don't need to read input or print anything. You just need to complete the function pow() that takes two parameters N and R denoting the input number and its reverse and returns power of (N to R)mod(109 + 7).

// Expected Time Complexity: O(LogN).
// Expected Auxiliary Space: O(LogN).

// Constraints:
// 1 <= N <= 109




//User function Template for Java

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        int mod = 1000000007;
        
        if(R == 0){
            return 1;
        }
        
        long ans = 0;
        if(R % 2 == 0){
            ans = power(N, R/2);
            ans = (ans * ans) % mod;
        }else{
            ans = N % mod;
            ans = (ans * power(N, R-1) % mod) % mod;
        }
        return ans % mod;
    }

}
