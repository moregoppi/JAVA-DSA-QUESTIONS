// Count the subarrays having product less than k
// MediumAccuracy: 21.0%Submissions: 70K+Points: 4
// Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

// Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.

// Example 1:

// Input : 
// n = 4, k = 10
// a[] = {1, 2, 3, 4}
// Output : 
// 7
// Explanation:
// The contiguous subarrays are {1}, {2}, {3}, {4} 
// {1, 2}, {1, 2, 3} and {2, 3} whose count is 7.
// Example 2:

// Input:
// n = 7 , k = 100
// a[] = {1, 9, 2, 8, 6, 4, 3}
// Output:
// 16
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function countSubArrayProductLessThanK() which takes the array a[], its size n and an integer k as inputs and returns the count of required subarrays.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1<=n<=106
// 1<=k<=1015
// 1<=a[i]<=105





//User function Template for Java


class Solution {
    
    public int countSubArrayProductLessThanK(long arr[], int n, long k)
    {
        long count = 0, sum = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i] < k){
                count++;
            }
            sum = arr[i];
            for(int j=i+1; j<n; j++){
                sum *= arr[j];
                if(sum < k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return (int)count;
    }
}
