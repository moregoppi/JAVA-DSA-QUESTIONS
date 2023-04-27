// 53. Maximum Subarray
// Medium
// 27.8K
// 1.2K
// Companies
// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


// Solution 1: Brute Force
class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<len; i++){
            sum = 0;
            for(int j=i; j<len; j++){
                sum += nums[j];
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
}

// Solution 2: Using prefix
class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int maxsum = nums[0];
        int minsum = 0;
        int sum = 0;
        for(int num : nums){
            sum += num;

            maxsum = Math.max(maxsum, sum-minsum);

            minsum = Math.min(minsum, sum);
        }
        return maxsum;
    }
}

// Solution 3: Kadan's Algorithm
class Solution {
    public int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0; i<arr.length; i++){
            if(curr < 0){
                curr = 0;
            }
            curr += arr[i];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
