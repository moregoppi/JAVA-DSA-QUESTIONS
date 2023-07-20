// Non Repeating Character
// EasyAccuracy: 40.43%Submissions: 160K+Points: 2
// POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
// Registered
// Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

// Example 1:

// Input:
// S = hello
// Output: h
// Explanation: In the given string, the
// first character which is non-repeating
// is h, as it appears first and there is
// no other 'h' in the string.
// Example 2:

// Input:
// S = zxvczbtxyzvy
// Output: c
// Explanation: In the given string, 'c' is
// the character which is non-repeating. 
// Your Task:
// You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(Number of distinct characters).
// Note: N = |S|

// Constraints:
// 1 <= N <= 105



//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
        //Your code here
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            if(mp.get(key) == 1){
                return key;
            }
        }
        return '$';
    }
}
