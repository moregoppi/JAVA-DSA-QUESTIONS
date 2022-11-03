// leetcode 4. Median of Two Sorted Arrays
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000C
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.



import java.util.*;
class Solution {
    public static void mergeArrays(int nums1[], int nums2[], int arr[]){
        int k = 0;
        for(int i=0; i<nums1.length; i++){
            arr[k] = nums1[i];
            k++;
        }
        for(int i=0; i<nums2.length; i++){
            arr[k] = nums2[i];
            k++;
        }
        Arrays.sort(arr);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        mergeArrays(nums1, nums2, arr);
        if(arr.length % 2 != 0){
            return arr[arr.length/2];
        }else{
            double bm = arr[(arr.length/2)-1];
            double am = arr[arr.length/2];
            return (am+bm)/2;
        }
        
    }
}
