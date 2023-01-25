// 453. Minimum Moves to Equal Array Elements
// Medium
// 2.1K
// 1.8K
// Companies
// Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

// In one move, you can increment n - 1 elements of the array by 1.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: 3
// Explanation: Only three moves are needed (remember each move increments two elements):
// [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
// Example 2:

// Input: nums = [1,1,1]
// Output: 0



class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min_num = Integer.MAX_VALUE;

        for(int n : nums){
            sum += n;
            if(n < min_num){
                min_num = n;
            }
        }
        return sum - min_num * nums.length;
    }
}
