// 152. Maximum Product Subarray
// Medium
// 14.9K
// 442
// Companies
// Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 
// ---------------------------------------------------------------------------------------------------------------------

// Brute Force
class Solution {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int product = 1;
                for(int k=i; k<=j; k++){
                    product *= nums[k];
                }
                if(product > result){
                    result = product;
                }
            }
        }
        return result;
    }
}


// Little optimize method
class Solution {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j=i; j<nums.length; j++){
                product *= nums[j];

                if(product > result){
                    result = product;
                }
            }
        }
        return result;
    }
}
