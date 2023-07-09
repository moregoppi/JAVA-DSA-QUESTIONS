// Smallest Positive missing number
// MediumAccuracy: 25.13%Submissions: 246K+Points: 4
// POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
// Registered
// You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

// Example 1:

// Input:
// N = 5
// arr[] = {1,2,3,4,5}
// Output: 6
// Explanation: Smallest positive missing 
// number is 6.
// Example 2:

// Input:
// N = 5
// arr[] = {0,-10,1,3,-20}
// Output: 2
// Explanation: Smallest positive missing 
// number is 2.
// Your Task:
// The task is to complete the function missingNumber() which returns the smallest positive missing number in the array.

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 <= N <= 106
// -106 <= arr[i] <= 106

// Brute Force
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int n = 1;
        Arrays.sort(arr);
        HashSet<Integer> list = new HashSet();
        for(int i=0; i<size; i++){
                list.add(arr[i]);
        }
        for(int key : list){
            if(key > 0 && key != n){
                return n;
            }else if(key > 0 && key == n){
                n++;
            }else{
                continue;
            }
        }
        return n;
    }
}


// optimze method
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int n = 1;
        Arrays.sort(arr);
        for(int i=0; i<size; i++){
            if(arr[i] == n){
                n++;
            }
        }
        return n;
    }
}
