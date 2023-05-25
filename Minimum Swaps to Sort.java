// Minimum Swaps to Sort
// MediumAccuracy: 38.39%Submissions: 130K+Points: 4
// Last Week Of Job Fair 2023. Explore Unlimited Opportunities Now!
// Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.


// Example 1:

// Input:
// nums = {2, 8, 5, 4}
// Output:
// 1
// Explaination:
// swap 8 with 4.
// Example 2:

// Input:
// nums = {10, 19, 6, 3, 5}
// Output:
// 2
// Explaination:
// swap 10 with 3 and swap 19 with 5.

// Your Task:
// You do not need to read input or print anything. Your task is to complete the function minSwaps() which takes the nums as input parameter and returns an integer denoting the minimum number of swaps required to sort the array. If the array is already sorted, return 0. 


// Expected Time Complexity: O(nlogn)
// Expected Auxiliary Space: O(n)


// Constraints:
// 1 ≤ n ≤ 105
// 1 ≤ numsi ≤ 106






class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], i);
        }
        Arrays.sort(nums);
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, false);
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(arr[i] || mp.get(nums[i]) == i){
                continue;
            }
            int j = i, cycle = 0;
            while(!arr[j]){
                arr[j] = true;
                j = mp.get(nums[j]);
                cycle++;
            }
            if(cycle > 0){
                ans += cycle - 1;
            }
        }
        return ans;
    }
}
