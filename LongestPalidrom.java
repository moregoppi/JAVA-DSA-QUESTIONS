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
    public int longestPalindrome(String s) {
        int chr[] = new int[52];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                chr[ch - 'a']++;
            }else{
                chr[ch - 'A' + 26]++;
            }
        }
        int count = 0;
        for(int i=0; i<chr.length; i++){
            count += chr[i] / 2;
        }
        count = count * 2;
        return Math.min(s.length(), count+1);
    }
}
