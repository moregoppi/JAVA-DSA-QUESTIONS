// Find kth element of spiral matrix
// MediumAccuracy: 50.66%Submissions: 26K+Points: 4
// POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
// Registered
// Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer k. The function will return the kth element obtained while traversing the matrix spirally.

// Example 1:

// Input:
// n = 4, m = 4, k = 10
// A[][] = {{1  2  3  4},
//          {5  6  7  8},
//          {9  10 11 12},
//          {13 14 15 16}}
// Output:
// 13
// Explanation:

// The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13. 
// Example 2:

// Input:
// n = 3, m = 3, k = 4
// A[][] = {{1 2 3},
//          {4 5 6},
//          {7 8 9}}
// Output:
// 6
// Explanation:
// The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.
// Your Task:
// You only need to implement the given function findK(). Do not read input, instead use the arguments given in the function. Return the K'th element obtained by traversing matrix spirally.

// Expected Time Complexity: O(n*m)
// Expected Auxiliary Space: O(n*m)

// Constraints:
// 1<=n,m<=103
// 1<=k<=n*m




class Solution
{
    /*You are required to complete this method*/
    int findK(int matrix[][], int n, int m, int k)
    {
	    // Your code here	
	    int startrow = 0;
        int endrow = n-1;
        int startcol = 0;
        int endcol = m-1;
        List<Integer> list = new ArrayList<>();

        int totalelements = matrix.length * matrix[0].length;
        while(startrow <= endrow && startcol <= endcol){

            // (top) left to right
            for(int i=startcol; i<=endcol && list.size() < totalelements; i++){
                list.add(matrix[startrow][i]);
            }

            // (right) top to buttom
            for(int i=startrow+1; i<=endrow-1 && list.size() < totalelements; i++){
                list.add(matrix[i][endcol]);
            }

            // (bottum) right to left;
            for(int i=endcol; i>=startcol && list.size() < totalelements; i--){
                list.add(matrix[endrow][i]);
            }

            // (left) bottum to top
            for(int i=endrow-1; i>=startcol+1 && list.size() < totalelements; i--){
                list.add(matrix[i][startcol]);
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        
        return list.get(k-1);
    }
}
