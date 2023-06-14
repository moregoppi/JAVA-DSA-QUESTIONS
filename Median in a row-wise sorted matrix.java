// Median in a row-wise sorted Matrix
// MediumAccuracy: 55.05%Submissions: 75K+Points: 4
// Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
// Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.

// Example 1:

// Input:
// R = 3, C = 3
// M = [[1, 3, 5], 
//      [2, 6, 9], 
//      [3, 6, 9]]
// Output: 5
// Explanation: Sorting matrix elements gives 
// us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 
 

// Example 2:

// Input:
// R = 3, C = 1
// M = [[1], [2], [3]]
// Output: 2
// Explanation: Sorting matrix elements gives 
// us {1,2,3}. Hence, 2 is median.

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function median() which takes the integers R and C along with the 2D matrix as input parameters and returns the median of the matrix.

// Expected Time Complexity: O(32 * R * log(C))
// Expected Auxiliary Space: O(1)


// Constraints:
// 1 <= R, C <= 400
// 1 <= matrix[i][j] <= 2000



//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here 
        int[] arr = new int[R*C];
        int k = 0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                arr[k] = matrix[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        if(arr.length % 2 != 0){
            return arr[(arr.length/2)];
        }
        return arr[arr.length/2-1];
    }
}

// Time complexity: O(R*C+(R*Clog(R*C)))
