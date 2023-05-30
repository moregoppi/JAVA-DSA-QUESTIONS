// 79. Word Search
// Medium
// 13.4K
// 545
// Companies
// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

// Example 1:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true
// Example 2:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
// Output: true
// Example 3:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
// Output: false
 

// Constraints:

// m == board.length
// n = board[i].length
// 1 <= m, n <= 6
// 1 <= word.length <= 15
// board and word consists of only lowercase and uppercase English letters.
 

// Follow up: Could you use search pruning to make your solution faster with a larger board?

// Accepted
// 1.3M
// Submissions
// 3.2M
// Acceptance Rate
// 40.3%

class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word, int i, int j, int s){
        if(i < 0 || i == board.length || j < 0 || j == board[0].length){
            return false;
        }
        if(board[i][j] != word.charAt(s)){
            return false;
        }

        if(s == word.length()-1){
            return true;
        }

        char temp = board[i][j];
        board[i][j] = '*';
        boolean isExist = dfs(board, word, i+1, j, s+1) ||
                          dfs(board, word, i-1, j, s+1) ||
                          dfs(board, word, i, j+1, s+1) ||
                          dfs(board, word, i, j-1, s+1);
        board[i][j] = temp;
        return isExist;
    }
}
