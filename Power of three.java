// 326. Power of Three
// Easy
// 2.3K
// 218
// Companies
// Given an integer n, return true if it is a power of three. Otherwise, return false.

// An integer n is a power of three, if there exists an integer x such that n == 3x.

 

// Example 1:

// Input: n = 27
// Output: true
// Explanation: 27 = 33
// Example 2:

// Input: n = 0
// Output: false
// Explanation: There is no x where 3x = 0.
// Example 3:

// Input: n = -1
// Output: false
// Explanation: There is no x where 3x = (-1).


class Solution {
    public boolean isPowerOfThree(int n) {
        int a = 3;
        double d = Math.log10(n) / Math.log10(a);

        if(d - (int)d == 0){
            return true;
        }else{
            return false;
        }

    }
}