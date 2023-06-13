// Rearrange Array Alternately
// MediumAccuracy: 35.15%Submissions: 205K+Points: 4
// Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
// Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
// Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

// Example 1:

// Input:
// n = 6
// arr[] = {1,2,3,4,5,6}
// Output: 6 1 5 2 4 3
// Explanation: Max element = 6, min = 1, 
// second max = 5, second min = 2, and 
// so on... Modified array is : 6 1 5 2 4 3.
// Example 2:

// Input:
// n = 11
// arr[]={10,20,30,40,50,60,70,80,90,100,110}
// Output:110 10 100 20 90 30 80 40 70 50 60
// Explanation: Max element = 110, min = 10, 
// second max = 100, second min = 20, and 
// so on... Modified array is : 
// 110 10 100 20 90 30 80 40 70 50 60.
// Your Task:
// The task is to complete the function rearrange() which rearranges elements as explained above. Printing of the modified array will be handled by driver code.

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 <= n <= 10^6
// 1 <= arr[i] <= 10^7




class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        long[] ans = new long[n];
        int i=0, j=n-1;
        int k = 0;
        while(i < j && k < n){
            ans[k] = arr[j];
            k++;
            ans[k] = arr[i];
            k++;
            i++;
            j--;
        }
        if(ans[n-1] == 0){
            ans[n-1] = arr[(n/2)];
        }
        for(int l=0; l<n; l++){
            arr[l] = ans[l];
        }
    }
    
}
