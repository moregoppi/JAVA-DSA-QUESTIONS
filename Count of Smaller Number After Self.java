// 315. Count of Smaller Numbers After Self
// Hard
// 7.7K
// 211
// Companies
// Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].

 

// Example 1:

// Input: nums = [5,2,6,1]
// Output: [2,1,1,0]
// Explanation:
// To the right of 5 there are 2 smaller elements (2 and 1).
// To the right of 2 there is only 1 smaller element (1).
// To the right of 6 there is 1 smaller element (1).
// To the right of 1 there is 0 smaller element.
// Example 2:

// Input: nums = [-1]
// Output: [0]
// Example 3:

// Input: nums = [-1,-1]
// Output: [0,0]

// Approach 1: Brute Force approach
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
}

// Approach 2:
class BinaryIndexedTree {
    int[] ft;
    BinaryIndexedTree(int n) {
        ft = new int[n];
    }
    void update(int k, int v) {
        for(; k < ft.length; k += (k & (-k))) {
            ft[k] += v;
        }
    }
    int rangeSumQuery(int r) {
        int sum = 0;
        for(; r > 0; r -= (r & (-r))) {
            sum += ft[r];
        }
        return sum;
    }
}
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        BinaryIndexedTree bit = new BinaryIndexedTree(20002);
        List<Integer> ans = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--) {
            ans.add(bit.rangeSumQuery(nums[i] + 10001 - 1));
            bit.update(nums[i] + 10001, 1);
        }
        Collections.reverse(ans);
        return ans;
    }
}
