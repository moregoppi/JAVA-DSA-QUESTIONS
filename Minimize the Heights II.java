// Minimize the Heights II
// MediumAccuracy: 15.06%Submissions: 442K+Points: 4
// Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 7 LPA  

// Given an array arr[] denoting heights of N towers and a positive integer K.

// For each tower, you must perform exactly one of the following operations exactly once.

// Increase the height of the tower by K
// Decrease the height of the tower by K
// Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

// You can find a slight modification of the problem here.
// Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.


// Example 1:

// Input:
// K = 2, N = 4
// Arr[] = {1, 5, 8, 10}
// Output:
// 5
// Explanation:
// The array can be modified as 
// {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}. 
// The difference between 
// the largest and the smallest is 8-3 = 5.
// Example 2:

// Input:
// K = 3, N = 5
// Arr[] = {3, 9, 12, 16, 20}
// Output:
// 11
// Explanation:
// The array can be modified as
// {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}. 
// The difference between 
// the largest and the smallest is 17-6 = 11. 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n, and k as input parameters and returns an integer denoting the minimum difference.


// Expected Time Complexity: O(N*logN)
// Expected Auxiliary Space: O(N)

// Constraints
// 1 ≤ K ≤ 104
// 1 ≤ N ≤ 105
// 1 ≤ Arr[i] ≤ 105




// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int min, max;
        int result = arr[n-1] - arr[0];
        
        for(int i=1; i<n; i++){
            if(arr[i] >= k){
                max = Math.max(arr[i-1]+k, arr[n-1]-k);
                min = Math.min(arr[0]+k, arr[i]-k);
                
                result = Math.min(result, max-min);
            }
        }
        return result;
    }
}
