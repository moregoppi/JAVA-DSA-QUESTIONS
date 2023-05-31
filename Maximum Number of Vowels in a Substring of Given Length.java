// 1456. Maximum Number of Vowels in a Substring of Given Length
// Medium
// 2.6K
// 87
// Companies
// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

// Example 1:

// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.
// Example 2:

// Input: s = "aeiou", k = 2
// Output: 2
// Explanation: Any substring of length 2 contains 2 vowels.
// Example 3:

// Input: s = "leetcode", k = 3
// Output: 2
// Explanation: "lee", "eet" and "ode" contain 2 vowels.
 

// Constraints:

// 1 <= s.length <= 105
// s consists of lowercase English letters.
// 1 <= k <= s.length
// Accepted
// 140.4K
// Submissions
// 238.2K
// Acceptance Rate
// 58.9%


// Solution : brute force
class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        for(int i=0; i<s.length()-k; i++){
            int count = 0;
            for(int j=i; j<i+k; j++){
                if(checkIt(s.charAt(j))){
                    count++;
                }
            }
            if(count > ans){
                ans = count;
            }
        }
        return ans;
    }

    private static boolean checkIt(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}



// Solution : Optimze Solution
class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int count = 0;
        for(int i=0; i<k; i++){
            if(checkIt(s.charAt(i))){
                count++;
            }
        }
        ans = count;

        for(int i=k; i<s.length(); i++){
            if(checkIt(s.charAt(i-k))){
                count--;
            }

            if(checkIt(s.charAt(i))){
                count++;
            }

            ans = Math.max(ans, count);
        }
        return ans;
    }

    private static boolean checkIt(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}



