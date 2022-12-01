// 1704. Determine if String Halves Are Alike
// Easy
// 1K
// 63
// Companies
// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

// Return true if a and b are alike. Otherwise, return false.

 

// Example 1:

// Input: s = "book"
// Output: true
// Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
// Example 2:

// Input: s = "textbook"
// Output: false
// Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
// Notice that the vowel o is counted twice.


// Approach:-
// Then we just need to keep a balance counter (ans) and iterate through both halves of the input string (S) and increment ans whenever the first half 
// has a vowel and decrement ans whenever the second half has a vowel.
// Once we're done, we can just return ans == 0 to determine if the two string halves are balanced.

class Solution {
    String vowels = "aeiouAEIOU";
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2, ans = 0;
        for(int i=0, j=mid; i < mid; i++, j++){
            if(vowels.indexOf(s.charAt(i)) >= 0){
                ans++;
            }
            if(vowels.indexOf(s.charAt(j)) >= 0){
                ans--;
            }
        }
        return ans == 0;
    }
}
