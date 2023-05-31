// Frequency Game
// EasyAccuracy: 62.74%Submissions: 26K+Points: 2
// Given an array A of size N. The elements of the array consist of positive integers. You have to find the largest element with minimum frequency.

// Example 1:

// Input: 
// 5
// 2 2 5 50 1
// Output:
// 50
// Explanation :
// All elements are having frequency 1 except 2.
// 50 is the maximum element with minimum frequency.
// Example 2:

// Input:
// 4
// 3 3 5 5
// Output:
// 5
// Explanation:
// Both 3 and 5 have the same frequency, so 5 should be returned.
// User Task:
// Your task is to complete the provided function LargButMinFreq(A, n) which accepts array A and n. Hence you have to return the largest element with minimum frequency.

// Expected Time Complexity: O(N)
// Expected Space Complexity: O(N)

// Constraints:
// 1 <= N <= 105
// 1 <= A[i] <= 106




// User function Template for Java

// Helper class to find largest number with minimum frequency
class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        int num = Integer.MIN_VALUE;
        int freq = Integer.MAX_VALUE;
        for(int Key : mp.keySet()){
            if(Key > num && mp.get(Key) <= freq){
                num = Key;
                freq = mp.get(Key);
            }
        }
        return num;
    }
}
