// 540. Single Element in a Sorted Array
// Medium
// 8K
// 125
// Companies
// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

 

// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Example 2:

// Input: nums = [3,3,7,7,10,11,11]
// Output: 10
 

// Constraints:

// 1 <= nums.length <= 105
// 0 <= nums[i] <= 105



class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int ans = -1;
        for(int i=0; i<n-1; i+=2){
            if(nums[i] != nums[i+1]){
                ans = nums[i];
                break;
            }
        }
        if(nums[n-2] != nums[n-1]){
            ans = nums[n-1];
        }
        return ans;
    }
}
