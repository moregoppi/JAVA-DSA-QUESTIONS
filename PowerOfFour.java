// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

 

// Example 1:

// Input: n = 16
// Output: true
// Example 2:

// Input: n = 5
// Output: false
// Example 3:

// Input: n = 1
// Output: true

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0 || n < 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        for(int i=1; i<Math.sqrt(n); i++){
            if(Math.pow(4,i) == n){
                return true;
            }
        }
        return false;
    }
}
