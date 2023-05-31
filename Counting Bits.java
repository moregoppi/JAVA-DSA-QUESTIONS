// 338. Counting Bits
// Easy
// 8.8K
// 424
// Companies
// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

// Example 1:

// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// Example 2:

// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101
 

// Constraints:

// 0 <= n <= 105
 

// Follow up:

// It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
// Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?


// Solution 1: O(nlogn)
class Solution {
    public static int count1s(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0; i<=n; i++){
            String s = Integer.toBinaryString(i);
            ans[i] = count1s(s);
        }
        return ans;
    }
}


// Solution 2: O(N)
class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];

        for(int i=1; i<=n; i++){
            if((i & 1) == 0){
                ans[i] = ans[i/2];
            }else{
                ans[i] = ans[i-1]+1;
            }
        }
        return ans;
    }
}
