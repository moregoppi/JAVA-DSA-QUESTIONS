// 219. Contains Duplicate II
// Easy
// 4.3K
// 2.4K
// Companies
// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

//Solution 1: Brute Force
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j] && j - i <= k){
                    return true;
                }
            }
        }
        return false;
    }
}


//Solution 2: Optimize Approach
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            if(map.containsKey(current) && i - map.get(current) <= k){
                return true;
            }else{
                map.put(current, i);
            }
        }
        return false;
    }
}
