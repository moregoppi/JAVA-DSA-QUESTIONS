// Find k-th smallest element in given n ranges
// MediumAccuracy: 50.29%Submissions: 26K+Points: 4
// Done with this problem? Now use these skills to apply for a job in Job-A-Thon 20!
// Given n ranges of the form [p, q] which denotes all the numbers in the range [p, p + 1, p + 2,...q].  Given another integer q denoting the number of queries. The task is to return the kth smallest element for each query (assume k>1) after combining all the ranges.
// In case the kth smallest element doesn't exist return -1. 

// Example 1:

// Input:
// n = 2, q = 3
// range[] = {{1, 4}, {6, 8}}
// queries[] = {2, 6, 10}
// Output: 
// 2 7 -1
// Explanation: 
// After combining the given ranges, 
// the numbers become 1 2 3 4 6 7 8. As here 2nd 
// element is 2, so we print 2. As 6th element is 
// 7, so we print 7 and as 10th element doesn't 
// exist, so weprint -1.
// Example 2:

// Input:
// n = 2, q = 2
// range[] = {{2, 6}, {5, 7}} 
// queries[] = {5, 8}
// Output: 
// 6 -1
// Explantion: 
// After combining the ranges, we'll take Union of 
// range= {2,3,4,5,6,7}, here  5th smallest number 
// will be 6 and 8th smallest number does not exists.
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function kthSmallestNum() which takes a n * 2 array denoting the ranges and an array denoting the queries.

// Expected Time Complexity: O(nlogn+q*n)
// Expected Auxiliary Space: O(q)

// Constraints:
// 1 <= n <= 103
// 1 <= range[i][0] <= range[i][1] <= 2*109
// 1 <= q <= 500
// 1 <= queries[i] <= 2*109




class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] subarray : range){
            int start = subarray[0];
            int end = subarray[1];
            
            for(int i=start; i<=end; i++){
                if(list.contains(i)){
                    continue;
                }else{
                    list.add(i);
                }
            }
        }
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            if(list.size() <= queries[i]-1){
                ans.add(-1);
            }else{
                ans.add(list.get(queries[i]-1));
            }
        }
        return ans;
    }
}
        
