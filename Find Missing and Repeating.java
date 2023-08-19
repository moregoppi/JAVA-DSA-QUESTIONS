// Find Missing And Repeating
// MediumAccuracy: 24.83%Submissions: 329K+Points: 4
// Done with this problem? Now use these skills to apply for a job in Job-A-Thon 21!

// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

// Example 1:

// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.
// Example 2:

// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 3 2
// Explanation: Repeating number is 3 and 
// smallest positive missing number is 2.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 2 ≤ N ≤ 105
// 1 ≤ Arr[i] ≤ N



// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int temp[] = new int[n];
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            temp[arr[i] - 1]++;
            if(temp[arr[i] - 1] > 1){
                ans[0] = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(temp[i] == 0){
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
}
