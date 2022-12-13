// 931. Minimum Falling Path Sum
// Medium
// 3.6K
// 111
// Companies
// Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

// A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

 

// Example 1:


// Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
// Output: 13
// Explanation: There are two falling paths with a minimum sum as shown.
// Example 2:


// Input: matrix = [[-19,57],[-40,-5]]
// Output: -59
// Explanation: The falling path with a minimum sum is shown.




class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length;
        if(len == 0){
            return 0;
        }
        int[][] dp = new int[len][len];
        for(int i=0; i<len; i++){
            dp[0][i] = matrix[0][i];
        }
        for(int i=1; i<len; i++){
            for(int j=0; j<len; j++){
                dp[i][j] = Math.min(Math.min(j > 0 ? dp[i-1][j-1]: Integer.MAX_VALUE, j+1 < len ? dp[i-1][j+1]: Integer.MAX_VALUE), dp[i-1][j]) + matrix[i][j];
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            res = Math.min(res, dp[len-1][i]);
        }
        return res;
    }
}
