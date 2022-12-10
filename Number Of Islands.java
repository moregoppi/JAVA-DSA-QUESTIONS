// 200. Number of Islands
// Medium
// 18.1K
// 410
// Companies
// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3

class Solution {
    private void dfs(char[][] grid, int m, int n, int i, int j){
        if(i < 0 || i >=m || j < 0 || j >= n || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = 'X';
        dfs(grid, m , n, i-1, j);
        dfs(grid, m , n, i+1, j);
        dfs(grid, m , n, i, j-1);
        dfs(grid, m , n, i, j-1);
        dfs(grid, m , n, i, j+1);
    }
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int count = 0;
        int m = grid.length;
        int n =grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid, m, n, i, j);
                }
            }
        }
        return count;
    }
}
