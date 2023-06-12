// 345. Reverse Vowels of a String
// Easy
// 3.5K
// 2.5K
// Companies
// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "hello"
// Output: "holle"
// Example 2:

// Input: s = "leetcode"
// Output: "leotcede"
 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left < right && !vowels.contains("" + s.charAt(left))){
                left++;
            }
            while(left < right && !vowels.contains("" + s.charAt(right))){
                right--;
            }
            sb.setCharAt(left, s.charAt(right));
            sb.setCharAt(right, s.charAt(left));
            left++;
            right--;
        }
        return sb.toString();
    }
}
