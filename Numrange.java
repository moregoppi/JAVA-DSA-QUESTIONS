// NUMRANGE
// Programming
// Checkpoint: Level 3
// Easy
// 40.0% Success

// 45

// 14

// Bookmark
// Given an array of non negative integers A, and a range (B, C), 

// find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

// Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]

// where 0 <= i <= j < size(A)

// Example :

// A : [10, 5, 1, 0, 2]
// (B, C) : (6, 8)
// ans = 3 

// as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]

// NOTE : The answer is guranteed to fit in a 32 bit signed integer.

public class Solution {
    public int numRange(int[] a, int B, int C) {
        int n = a.length;
        int prefixSum[] = new int[n+1];
        
        for(int i=1; i<=n; i++){
            prefixSum[i] = prefixSum[i-1] + a[i-1];
        }
        
        int count = 0;
        for(int i=0; i < n; i++){
            for(int j=i+1; j <= n; j++){
                int sum = prefixSum[j] - prefixSum[i];
                
                if(sum >= B && sum <= C){
                    count++;
                }else if(sum > C){
                    break;
                }
            }
        }
        return count;
    }
}
