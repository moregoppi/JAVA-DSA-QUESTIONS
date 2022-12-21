// 506. Relative Ranks
// Easy
// 828
// 42
// Companies
// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.

 

// Example 1:

// Input: score = [5,4,3,2,1]
// Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
// Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
// Example 2:

// Input: score = [10,3,8,9,4]
// Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
// Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].


class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int pairs[][] = new int[n][2];
        for(int i=0; i<n; i++){
            pairs[i][0] = score[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a,b) -> (b[0] - a[0]));
        String[] arr = new String[n];
        arr[pairs[0][1]] = "Gold Medal";
        if(n >= 2){
            arr[pairs[1][1]] = "Silver Medal";
        }
        if(n >= 3){
            arr[pairs[2][1]] = "Bronze Medal";
        }
        for(int i=3; i<score.length; i++){
            arr[pairs[i][1]] = Integer.toString(i+1);            
        }
        return arr;
    }
}
