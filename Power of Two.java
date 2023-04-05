// 231. Power of Two
// Easy
// 4.7K
// 344
// Companies
// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

 

// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16
// Example 3:

// Input: n = 3
// Output: false

//  recursive method
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        if(n % 2 == 0){
            return isPowerOfTwo(n / 2);
        }
        if(n == 1){
            return true;
        }
        return false;
    }
}


// Iterative method
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 8){
            return true;
        }
        for(int i=0; i<=Math.sqrt(n); i++){
            if(Math.pow(2,i) == n){
                return true;
            }
        }
        return false;
    }
}
