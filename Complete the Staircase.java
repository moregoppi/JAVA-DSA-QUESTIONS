// Complete the Staircase
// Accuracy: 60.0%Submissions: 5+Points: 25
// Geek has N bricks. He needs to build a staircase consisting of k rows where the ith row has exactly i bricks. If he starts from the first row, find the number of complete rows of the staircase that he will be able to build completely.

// Example 1:

// Input:
// N: 5
// Output: 2
// Explanation: 
// Row 1: X
// Row 2: X X
// Row 3: X X
// Only 2 rows are complete.

// Example 2:

// Input:
// N: 8
// Output: 3
// Explanation:
// X
// X X
// X X X
// X X
// Only 3 rows are complete.

// Your Task:
// You dont need to read input or print anything. Your task is to complete the in java

class Solution {
    public int completeStaircase(int N) {
        int rows = 0;
        int bricks = 0;
        
        while (N >= bricks) {
            rows++;
            bricks += rows;
        }
        
        return rows - 1;
    }
}
