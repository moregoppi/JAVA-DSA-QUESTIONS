// 238. Product of Array Except Self
// Medium
// 16.1K
// 896
// Companies
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]


// Brute Force
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j=0; j<nums.length; j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
}

// Optimize method
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left_products = new int[n];
        int[] right_products = new int[n];

        int[] ans = new int[n];

        left_products[0] = 1;
        right_products[n-1] = 1;

        for(int i=1; i<n; i++){
            left_products[i] = nums[i-1] * left_products[i-1];
        }

        for(int i=n-2; i>=0; i--){
            right_products[i] = nums[i+1] * right_products[i+1];
        }

        for(int i=0; i<n; i++){
            ans[i] = left_products[i] * right_products[i];
        }

        return ans;
    }
}
