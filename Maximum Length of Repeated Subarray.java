// 718. Maximum Length of Repeated Subarray
// Medium
// 6.3K
// 153
// Companies
// Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.

 

// Example 1:

// Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
// Output: 3
// Explanation: The repeated subarray with maximum length is [3,2,1].
// Example 2:

// Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
// Output: 5
// Explanation: The repeated subarray with maximum length is [0,0,0,0,0].
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 100
// Accepted
// 267.7K
// Submissions
// 523.1K
// Acceptance Rate
// 51.2%

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans = 0;
        int[][] dp = new int[n+1][m+1];
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(nums1[i] == nums2[j]){
                    dp[i][j] = dp[i+1][j+1]+1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }
}
