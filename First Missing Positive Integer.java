// 41. First Missing Positive
// Hard
// 12.6K
// 1.5K
// Companies
// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses constant extra space.

 

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// Example 2:

// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// Example 3:

// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.


class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        HashSet<Integer> list = new HashSet<>();
        for(int i=0; i<len; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        int count = 1;
        while(true){
            if(!list.contains(count)){
                return count;
            }
            count++;
        }
    }
}
