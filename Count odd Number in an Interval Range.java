// 1523. Count Odd Numbers in an Interval Range
// Easy
// 1.3K
// 89
// Companies
// Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

 

// Example 1:

// Input: low = 3, high = 7
// Output: 3
// Explanation: The odd numbers between 3 and 7 are [3,5,7].
// Example 2:

// Input: low = 8, high = 10
// Output: 1
// Explanation: The odd numbers between 8 and 10 are [9].




// Apporach 1: BRUTE FORCE APPROACH
class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++){
            if(i%2 == 1){
                count++;
            }
        }
        return count;
    }
}


// Approach 2: Optimized Apporach
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1)/2 - low/2;
    }
}
