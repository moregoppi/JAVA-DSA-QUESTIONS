// 567. Permutation in String
// Medium
// 8.8K
// 281
// Companies
// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

 

// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").
// Example 2:

// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false
 


class Solution {
  public boolean checkInclusion(String s1, String s2) {
    int[] count = new int[128];
    int required = s1.length();

    for (final char c : s1.toCharArray())
      ++count[c];

    for (int l = 0, r = 0; r < s2.length(); ++r) {
      if (--count[s2.charAt(r)] >= 0)
        --required;
      while (required == 0) {
        if (r - l + 1 == s1.length())
          return true;
        if (++count[s2.charAt(l++)] > 0)
          ++required;
      }
    }

    return false;
  }
}
