// 367. Valid Perfect Square
// Easy
// 3.1K
// 264
// Companies
// Given a positive integer num, write a function which returns True if num is a perfect square else False.

// Follow up: Do not use any built-in library function such as sqrt.

 

// Example 1:

// Input: num = 16
// Output: true
// Example 2:

// Input: num = 14

class Solution {
    public boolean isPerfectSquare(int num) {
        int temp = (int)Math.sqrt(num);
        if(temp * temp == num){
            return true;
        }else{
            return false;
        }
    }
}
