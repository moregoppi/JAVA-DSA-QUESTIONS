// Check Palindrome!
// Programming
// Hashing
// Easy
// 79.4% Success

// 124

// 4

// Bookmark
// Asked In:
// Problem Description
 
 

// Given a string A consisting of lowercase characters.

// Check if characters of the given string can be rearranged to form a palindrome.

// Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



// Problem Constraints
// 1 <= |A| <= 105

// A consists only of lower-case characters.



// Input Format
// First argument is an string A.



// Output Format
// Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



// Example Input
// Input 1:

//  A = "abcde"
// Input 2:

//  A = "abbaee"


// Example Output
// Output 1:

//  0
// Output 2:

//  1


// Example Explanation
// Explanation 1:

//  No possible rearrangement to make the string palindrome.
// Explanation 2:

//  Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.

public class Solution {
    public int solve(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        
        int oddcount = 0;
        
        for(Character i : mp.keySet()){
            if(mp.get(i) % 2 == 1){
                oddcount++;   
                if(oddcount > 1){
                    return 0;
                }
            }
        }
        return 1;
    }
}
