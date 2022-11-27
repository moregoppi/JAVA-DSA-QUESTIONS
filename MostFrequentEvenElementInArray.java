// 2404. Most Frequent Even Element
// Easy
// 407
// 11
// Companies
// Given an integer array nums, return the most frequent even element.

// If there is a tie, return the smallest one. If there is no such element, return -1.

 

// Example 1:

// Input: nums = [0,1,2,2,4,4,1]
// Output: 2
// Explanation:
// The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
// We return the smallest one, which is 2.


class Solution {
    public int mostFrequentEven(int[] nums) {
        if(nums.length == 1){
            if(nums[0]%2==0){
                return nums[0];
            }
        }
        Arrays.sort(nums);
        int maxCount = 0;
        int index = -1;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=i+1; j<nums.length ;j++){
                if(nums[i]%2 == 0){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
            }
            if(count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        
        if(maxCount == 0){
            for(int j=0; j<nums.length; j++){
                if(nums[j]%2==0){
                    return nums[j];
                }
            }
        }
        
        if(index == -1){
            return -1;
        }else{
            return nums[index];
        }
    }
}
