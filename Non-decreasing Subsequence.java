// 491. Non-decreasing Subsequences
// Medium
// 2.7K
// 188
// Companies
// Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with at least two elements. You may return the answer in any order.

 

// Example 1:

// Input: nums = [4,6,7,7]
// Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
// Example 2:

// Input: nums = [4,4,3,2,1]
// Output: [[4,4]]

// Brute Force

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
		    int start = i;
		    for(int j=i+1; j<nums.length; j++){
		        int end = j;
                List<Integer> list = new ArrayList<>();
		        for(int k=start; k<=end; k++){
    		        if(k == nums.length-1){
    		            if(nums[k-1] <= nums[k]){
                            list.add(nums[k]);
    		            }
    		        }else{
        		        if(nums[k] <= nums[k+1]){
        		            list.add(nums[k]);
        		        }
    		        }
		        }
		        ans.add(list);
		    }
        }   
        return ans;
    }
}
