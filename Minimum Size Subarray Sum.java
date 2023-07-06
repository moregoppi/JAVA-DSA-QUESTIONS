// 209. Minimum Size Subarray Sum
// Medium
// 10.3K
// 289
// Companies
// Given an array of positive integers nums and a positive integer target, return the minimal length of a 
// subarray
//  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0
 

// Constraints:

// 1 <= target <= 109
// 1 <= nums.length <= 105
// 1 <= nums[i] <= 104
 

// Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
// Accepted
// 751.9K
// Submissions
// 1.6M
// Acceptance Rate
// 45.8%

// BRUTE FORCE

// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int ans = Integer.MAX_VALUE;
//         for(int i=0; i<nums.length; i++){
//             int sum = 0;
//             for(int j=i; j<nums.length; j++){
//                 sum += nums[j];
//                 if(sum == target){
//                     ans = Math.min(ans, (j-i+1));
//                 }
//             }
//         }
//         if(ans == Integer.MAX_VALUE){
//             return 0;
//         }
//         return ans;
//     }
// }


// OPTIMZE METHOD
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for(int l=0, r=0; r<nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                ans = Math.min(ans, r-l+1);
                sum -= nums[l++];
            }
        }
        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}
