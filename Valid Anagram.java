// 242. Valid Anagram
// Easy
// 8.5K
// 279
// Companies
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(mp.get(ch) != null){
                if(mp.get(ch) == 1){
                    mp.remove(ch);
                }else{
                    mp.put(ch, mp.get(ch) - 1);
                }
            }
        }

        return mp.isEmpty();
    }
}
