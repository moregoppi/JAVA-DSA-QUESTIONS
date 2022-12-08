// 3. Longest Substring Without Repeating Characters
// Medium
// 30.7K
// 1.3K
// Companies
// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.





// Approach:-
// There can be different methods, lets understand by first simple solution,
//Method 1: We can consider all substrings one by one and check for each substring whether it contains all unique characters or not. There will be n*(n+1)/2 substrings.
//Whether a substring contains all unique characters or not can be checked in linear time by scanning it from left to right and keeping a map of visited characters.
//Here we are using two for loops and checking every character.


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        ArrayList<Character> check = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(check.contains(s.charAt(j))){
                    check.clear();
                    break;
                }else{
                    check.add(s.charAt(j));
                    if(res < j - i + 1){
                        res = j - i + 1;
                    }
                }
            }
        }
        return res;
    }
}
