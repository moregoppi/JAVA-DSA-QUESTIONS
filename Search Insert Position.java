// 35. Search Insert Position
// Easy
// 10.9K
// 514
// Companies
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4


class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        if(nums.length == 1 && target > nums[0]){
            return 1;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]== target){
                return i;
            }else if(target > nums[i] && target <= nums[i+1]){
                result = i + 1;
                break;
            }else if(target > nums[i+1] && (nums.length-1 == i+1)){
                result = nums.length;
                break;
            }else if(target < nums[i+1] && i == 0){
                result = 0;
                break;
            }else if(target>nums[i] && target > nums[i+1]){
                continue;
            }
        }
        return result;
    }
}
