// 1493. Longest Subarray of 1's After Deleting One Element
// Medium
// 2.4K
// 44
// Companies
// Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 

// Example 1:

// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
// Example 2:

// Input: nums = [0,1,1,1,0,1,1,0,1]
// Output: 5
// Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
// Example 3:

// Input: nums = [1,1,1]
// Output: 2
// Explanation: You must delete one element.
 

// Constraints:

// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.
// Accepted
// 105.2K
// Submissions
// 162.5K
// Acceptance Rate
// 64.7%

class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                if(count > 0){
                    list.add(count);
                    count = 0;
                }
                list.add(0);
            }else{
                count++;
            }
        }
        list.add(count);
        if(list.size() == 1){
            return nums.length-1;
        }
        if(list.size() == 2){
            return Math.max(list.get(0), list.get(1));
        }
        int max = 0;
        for(int i=0; i<list.size()-2; i++){
            max = Math.max(max, list.get(i) + list.get(i+2));
        }
        return max;
    }
}
