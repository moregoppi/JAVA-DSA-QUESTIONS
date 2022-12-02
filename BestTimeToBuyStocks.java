// 409. Longest Palindrome
// Easy
// 4K
// 236
// Companies
// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

// Example 1:

// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:

// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.


class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null){
            return 0;
        }
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            int money = prices[i] - min;
            if(money > max){
                max = money;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return max;
    }
}
