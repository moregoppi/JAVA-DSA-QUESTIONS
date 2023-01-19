// 974. Subarray Sums Divisible by K
// Medium
// 4.7K
// 181
// Companies
// Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

// A subarray is a contiguous part of an array.

 

// Example 1:

// Input: nums = [4,5,0,-2,-3,1], k = 5
// Output: 7
// Explanation: There are 7 subarrays with a sum divisible by k = 5:
// [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
// Example 2:

// Input: nums = [5], k = 9
// Output: 0

// ------------------------------------------------------------------------------------------------------------------------------------------------------

// Brute Force 
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------

// Optimize Method
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int map[] = new int[k];
        map[0] = 1;
        int sum = 0;
        int count = 0; 
        for(int i : nums){
            sum = (sum + i) % k;
            if(sum < 0) sum += k;
            count += map[sum];
            map[sum]++;
        }
        return count;
    }
}
