// 16. 3Sum Closest
// Medium
// 8.3K
// 457
// Companies
// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).







class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int current_sum = nums[i]+nums[j]+nums[k];
                if(current_sum > target){
                    k -= 1;
                }else{
                    j += 1;
                }

                if(Math.abs(target - current_sum) < Math.abs(result - target)){
                    result = current_sum;
                }
            }
        }
        return result;
    }
}
