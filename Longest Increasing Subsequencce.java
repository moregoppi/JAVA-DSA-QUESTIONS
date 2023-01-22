// 300. Longest Increasing Subsequence
// Medium
// 16.2K
// 296
// Companies
// Given an integer array nums, return the length of the longest strictly increasing 
// subsequence
// .

 

// Example 1:

// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
// Example 2:

// Input: nums = [0,1,0,3,2,3]
// Output: 4
// Example 3:

// Input: nums = [7,7,7,7,7,7,7]
// Output: 1

class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int len = 0;
        for(int num : nums){
            int i = Arrays.binarySearch(dp, 0, len, num);
            if(i < 0){
                i = -(i+1);
            }
            dp[i] = num;
            if(i == len){
                len++;
            }
        }
        return len;
    }
}
