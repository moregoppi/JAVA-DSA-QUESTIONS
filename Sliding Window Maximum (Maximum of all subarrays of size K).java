// 239. Sliding Window Maximum
// Hard
// 13.8K
// 453
// Companies
// You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

// Return the max sliding window.

 

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// 1 <= k <= nums.length


import java.util.PriorityQueue;

public class slidingwindow {
    static class Element implements Comparable<Element>{
        int num;
        int idx;

        public Element(int num, int idx){
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Element p2){
            return p2.num - this.num;
        }
    }

    // time complexity O(n logn)
    public static int[] usingPriorityQueue(int[] arr, int k, int[] result){
        if(k == 1){
            return arr;
        }
        
        PriorityQueue<Element> pq = new PriorityQueue<>();

        for(int i=0; i<k; i++){
            pq.add(new Element(arr[i], i));
        }

        result[0] = pq.peek().num;

        for(int i=k; i<arr.length; i++){
            while(pq.size() > 1 && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Element(arr[i], i));
            result[i-k+1] = pq.peek().num;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};

        int k = 3;

        // this is how we store value for answer
        int[] result = new int[arr.length-k+1];
        
        usingPriorityQueue(arr, k, result);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
