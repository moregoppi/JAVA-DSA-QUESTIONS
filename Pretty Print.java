// PRETTYPRINT
// Programming
// Checkpoint: Level 2
// Easy
// 73.5% Success

// 88

// 25

// Bookmark
// Print concentric rectangular pattern in a 2d matrix. 

// Let us show you some examples to clarify what we mean.

// Example 1:

// Input: A = 4.

// Output:

// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4 
// 4 3 2 1 2 3 4 
// 4 3 2 2 2 3 4 
// 4 3 3 3 3 3 4 
// 4 4 4 4 4 4 4 
// Example 2:

// Input: A = 3.

// Output:

// 3 3 3 3 3 
// 3 2 2 2 3 
// 3 2 1 2 3 
// 3 2 2 2 3 
// 3 3 3 3 3 
// The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

// You will be given A as an argument to the function you need to implement, and you need to return a 2D array.

public class Solution {
    public int[][] prettyPrint(int n) {
        int[][] ans = new int[2*n-1][2*n-1];
        int num = n;
        int top = 0, buttom = 2*n-2, left = 0, right = 2*n-2;
        while(top <= buttom && left <= right){
            for(int i=left; i<right; i++){
                ans[top][i] = num;
                ans[buttom][i] = num;
            }
            for(int i=top; i<=buttom; i++){
                ans[i][left] = num;
                ans[i][right] = num;
            }
            top++;
            buttom--;
            left++;
            right--;
            num--;
        }
        return ans;
    }
}
