// // Leetcode 9. Palindrome Number
// // Given an integer x, return true if x is a palindrome, and false otherwise.
// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.



class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        
        int copy = x;
        int rev = 0;
        while(x != 0){
            int lastdigit = x % 10;
            rev = (rev*10) + lastdigit;
            x = (int) (x/10);
        }
        if(rev == copy){
            return true;
        }else{
            return false;
        }
    }
}
