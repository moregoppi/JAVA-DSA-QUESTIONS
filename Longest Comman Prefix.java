// 14. Longest Common Prefix
// Easy
// 12.3K
// 3.7K
// Companies
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        for(int i=0; i<strs[0].length(); i++){
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
