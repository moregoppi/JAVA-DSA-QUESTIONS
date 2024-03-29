// Boolean Matrix
// MediumAccuracy: 40.05%Submissions: 88K+Points: 4
// Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

// banner
// Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.

// Example 1:

// Input:
// R = 2, C = 2
// matrix[][] = {{1, 0},
//               {0, 0}}
// Output: 
// 1 1
// 1 0 
// Explanation:
// Only cell that has 1 is at (0,0) so all 
// cells in row 0 are modified to 1 and all 
// cells in column 0 are modified to 1.

// Example 2:

// Input:
// R = 4, C = 3
// matrix[][] = {{ 1, 0, 0},
//               { 1, 0, 0},
//               { 1, 0, 0},
//               { 0, 0, 0}}
// Output: 
// 1 1 1
// 1 1 1
// 1 1 1
// 1 0 0 
// Explanation:
// The position of cells that have 1 in
// the original matrix are (0,0), (1,0)
// and (2,0). Therefore, all cells in row
// 0,1,2 are and column 0 are modified to 1. 
// Your Task:
// You dont need to read input or print anything. Complete the function booleanMatrix() that takes the matrix as input parameter and modifies it in-place.

// Expected Time Complexity: O(R * C)
// Expected Auxiliary Space: O(R + C) 




//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        
        int row[] = new int[n];
        int col[] = new int[m];
        
        Arrays.fill(row, 0);
        Arrays.fill(col, 0);
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 1;
                }
            }
        }
        return;
    }
}
