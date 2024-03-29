// 96. Unique Binary Search Trees
// Medium
// 8.6K
// 345
// Companies
// Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.

 

// Example 1:


// Input: n = 3
// Output: 5
// Example 2:

// Input: n = 1
// Output: 1

class Solution {
    public int numTrees(int n) {
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;
        for(int i=2; i<=n; ++i){
            for(int j=0; j<i; ++j){
                G[i] += G[j] * G[i-j-1];
            }
        }
        return G[n];
    }
}
