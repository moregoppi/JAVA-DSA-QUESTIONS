// Second Largest
// EasyAccuracy: 26.72%Submissions: 373K+Points: 2
// Done with this problem? Now use these skills to apply for a job in Job-A-Thon 21!

// Given an array Arr of size N, print second largest distinct element from an array.

// Example 1:

// Input: 
// N = 6
// Arr[] = {12, 35, 1, 10, 34, 1}
// Output: 34
// Explanation: The largest element of the 
// array is 35 and the second largest element
// is 34.
// Example 2:

// Input: 
// N = 3
// Arr[] = {10, 5, 10}
// Output: 5
// Explanation: The largest element of 
// the array is 10 and the second 
// largest element is 5.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 2 ≤ N ≤ 105
// 1 ≤ Arri ≤ 105
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        Set<Integer> set = new TreeSet<>(list);
        list.clear();
        for(int num : set){
            list.add(num);
        }
        int size = list.size();
        if(size == 1){
            return -1;
        }
        return list.get(size-2);
    }
}
