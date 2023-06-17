// Rotate matrix elements clockwise
// EasyAccuracy: 45.28%Submissions: 5K+Points: 2
// Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
// Given two integers M, N, and a 2D matrix Mat of dimensions MxN, clockwise rotate the elements in it.

// Example 1:

// Input:
// M=3,N=3
// Mat=[[1,2,3],[4,5,6],[7,8,9]]
// Output:
// 4 1 2
// 7 5 3
// 8 9 6
// Explanation:
// Rotating the matrix clockwise gives this result.
// Example 2:

// Input:
// M=2,N=3
// Mat=[[1,2,3],[2,3,3]]
// Output:
// 2 1 2
// 3 3 3
// Explanation:
// Rotating the matrix clockwise gives this result.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function rotateMatrix() which takes two integers M, N, and a 2D matrix as input parameters and returns the clockwise rotated matrix.


// Expected Time Complexity:O(M*N)
// Expected Auxillary Space:O(1)


// Constraints:
// 1<=M,N,Mat[i][j]<=1000





// User function Template for Java

class Solution {
    int[][] rotateMatrix(int M, int N, int Mat[][]) {
        // code here
        int row = 0;
        int col = 0;
        
        int prev, curr;
        
        while(row < M && col < N){
            if(row + 1 == M || col + 1 == N){
                break;
            }
            prev = Mat[row+1][col];
            
            for(int i=col; i<N; i++){
                curr = Mat[row][i];
                Mat[row][i] = prev;
                prev = curr;
            }
            row++;
            
            for(int i=row; i<M; i++){
                curr = Mat[i][N-1];
                Mat[i][N-1] = prev;
                prev = curr;
            }
            N--;
            
            if(row < M){
                for(int i=N-1; i>=col; i--){
                    curr = Mat[M-1][i];
                    Mat[M-1][i] = prev;
                    prev = curr;
                }
            }
            M--;
            if(col < N){
                for(int i=M-1; i>=row; i--){
                    curr = Mat[i][col];
                    Mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }
        
        return Mat;
    }
}
