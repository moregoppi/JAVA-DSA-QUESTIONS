// 233. Number of Digit One
// Hard
// 975
// 1.2K
// Companies
// Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

 

// Example 1:

// Input: n = 13
// Output: 6
// Example 2:

// Input: n = 0
// Output: 0

class Solution {
    public int countDigitOne(int n) {
        int count = 0, factor = 1, k = n;
        while(k>0){
            int m = k/10, r = k % 10, amount;

            if(r == 0){
                amount = 0;
            }else if(r > 1){
                amount = factor;
            }else{
                amount = n % factor + 1;
            }
            count += m*factor + amount;
            factor *= 10;
            k = k/10;
        }
        return count;
    }
}
