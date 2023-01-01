// 290. Word Pattern
// Easy
// 4.9K
// 559
// Companies
// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }

        Map<Character, Integer> charToindex = new HashMap<>();
        Map<String, Integer> strToindex = new HashMap<>();

        for(Integer i=0; i<pattern.length(); ++i){
            if(charToindex.put(pattern.charAt(i), i) != strToindex.put(words[i], i)){
                return false;
            }
        }
        return true;
    }
}
