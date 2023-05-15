// Window String
// Programming
// Hashing
// Medium
// 31.1% Success

// 200

// 14

// Bookmark
// Asked In:
// Problem Description
 
 

// Given a string A and a string B, find the window with minimum length in A, which will contain all the characters in B in linear time complexity.
//  Note that when the count of a character c in B is x, then the count of c in the minimum window in A should be at least x.

// Note:

// If there is no such window in A that covers all characters in B, return the empty string.
// If there are multiple such windows, return the first occurring minimum window ( with minimum start index and length )
 



// Problem Constraints
// 1 <= size(A), size(B) <= 106



// Input Format
// The first argument is a string A.
// The second argument is a string B.



// Output Format
// Return a string denoting the minimum window.



// Example Input
// Input 1:

//  A = "ADOBECODEBANC"
//  B = "ABC"
// Input 2:

//  A = "Aa91b"
//  B = "ab"
 



// Example Output
// Output 1:

//  "BANC"
// Output 2:

//  "a91b"


// Example Explanation
// Explanation 1:

//  "BANC" is a substring of A which contains all characters of B.
// Explanation 2:

//  "a91b" is the substring of A which contains all characters of B.


public class Solution {
    public String minWindow(String A, String B) {
        if(A.length() < B.length()){
            return "";
        }
        
        HashMap<Character, Integer> mp = new HashMap<>();
        
        for(char a : B.toCharArray()){
            mp.put(a, mp.getOrDefault(a, 0)+1);
        }
        
        int left = 0;
        int right = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int minleft = 0;
        int minright = 0;
        
        while(right < A.length()){
            char ch = A.charAt(right);
            if(mp.containsKey(ch)){
                int freq = mp.get(ch);
                if(freq > 0){
                    count++;
                }
                mp.put(ch, freq - 1);
            }
            while(B.length() == count){
                if(right -left + 1 < minLen){
                    minLen = right - left + 1;
                    minleft = left;
                    minright = right + 1;
                }
                char leftCh = A.charAt(left);
                if (mp.containsKey(leftCh)) {
                    int freq = mp.get(leftCh);
                    if (freq == 0) {
                        count--;
                    }
                    mp.put(leftCh, freq + 1);
                }
                left++;
            }
            right++;   
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return A.substring(minleft, minright);
    }
}
