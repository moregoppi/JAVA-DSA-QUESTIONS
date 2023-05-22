// 347. Top K Frequent Elements
// Medium
// 13.9K
// 502
// Companies
// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// k is in the range [1, the number of unique elements in the array].
// It is guaranteed that the answer is unique.
 
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> mp.get(a) - mp.get(b));

        for(int key : mp.keySet()){
            minHeap.offer(key);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] arr = new int[k];
        int i = k-1;
        while(!minHeap.isEmpty()){
            arr[i--] = minHeap.poll();
        }
        return arr;
    }
}
