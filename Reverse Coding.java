// Reverse Coding
// EasyAccuracy: 61.45%Submissions: 47K+Points: 2
// Applying for a job now easier than today's problem! Apply for Mega Job-A-Thon  

// You will be given an integer n, your task is to return the sum of all natural number less than or equal to n.

// As the answer could be very large, return answer modulo 109+7.

// Example 1:

// Input:
// n = 6
// Output:
// 21
// Explanation:
// 1+2+3+4+5+6 = 21
// Example 2:

// Input:
// n = 4
// Output:
// 10
// Explanation:
// 1+2+3+4 = 10
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function sumOfNaturals() which takes a single integer n as input and returns sum of all numbers x upto n, i.e., 1 <= x <= n.

// Expected Time Complexity: O(1)
// Expected Auxiliary Space: O(1)




//User function Template for Java

class Solution {
    static int sumOfNaturals(int n) {
        long ans = (long) n * (n+1) / 2;
        int modulo = 1000000007;
        return (int)(ans % modulo);
    }
};