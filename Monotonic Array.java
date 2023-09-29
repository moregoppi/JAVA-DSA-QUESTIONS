// 896. Monotonic Array
// Easy
// 2.6K
// 76
// Companies
// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

// Example 1:

// Input: nums = [1,2,2,3]
// Output: true
// Example 2:

// Input: nums = [6,5,4,4]
// Output: true
// Example 3:

// Input: nums = [1,3,2]
// Output: false
 

// Constraints:

// 1 <= nums.length <= 105
// -105 <= nums[i] <= 105
// Accepted
// 327.4K
// Submissions
// 545.5K
// Acceptance Rate
// 60.0%

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                inc = false;
            }
        }
        for(int i=0; i<n-1; i++){
            if(nums[i] < nums[i+1]){
                dec = false;
            }
        }

        return inc || dec;
    }
}
