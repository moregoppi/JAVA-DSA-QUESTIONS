// Find Kth permutation
// MediumAccuracy: 63.45%Submissions: 18K+Points: 4
// Getting a High Paying Job Now Easier Than Today's Problem! Apply For Mega Job-A-Thon  

// Given two integers N (1<=N<=9) and K. Find the kth permutation sequence of first N natural numbers. Return the answer in string format.

// Example 1:

// Input: N = 4, K = 3
// Output: 1324
// Explanation: 
// Permutations of first 4 natural numbers:
// 1234,1243,1324,1342,1423,1432.....
// So the 3rd permutation is 1324. 
// Example 2:

// Input: N = 3, K = 5
// Output: 312
// Explanation: 
// Permutations of first 3 natural numbers:
// 123,132,213,231,312,321.
// So the 5th permutation is 312. 
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function kthPermutation() which takes two integers N and K as input parameters and returns a string denoting the kth permutation.

// Expected Time Complexity: O(N2)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 <= N <= 9
// 1 <= K <= N!


class Solution {
    public static String kthPermutation(int n,int k) {
        // code here
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        // Initialize numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Calculate factorials
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = i * factorial[i - 1];
        }

        // Decrement k to match 0-based indexing
        k--;

        // Generate kth permutation
        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k -= index * factorial[n - i];
        }

        return sb.toString();
    }
}
        
