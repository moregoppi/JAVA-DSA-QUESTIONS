// Search Pattern (Rabin-Karp Algorithm)
// MediumAccuracy: 34.53%Submissions: 18K+Points: 4
// Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 

// Given two strings, one is a text string and other is a pattern string. The task is to print the indexes of all the occurences of pattern string in the text string. For printing, Starting Index of a string should be taken as 1.

// Example 1:

// Input:
// S = "batmanandrobinarebat", pat = "bat"
// Output: 1 18
// Explanation: The string "bat" occurs twice
// in S, one starts are index 1 and the other
// at index 18. 
// â€‹Example 2:

// Input: 
// S = "abesdu", pat = "edu"
// Output: -1
// Explanation: There's not substring "edu"
// present in S.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function search() which takes the string S and the string pat as inputs and returns an array denoting the start indices (1-based) of substring pat in the string S. 


// Expected Time Complexity: O(|S|*|pat|).
// Expected Auxiliary Space: O(1).


// Constraints:
// 1<=|S|<=105
// 1<=|pat|<|S|



//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        int n = pat.length();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=S.length()-n; i++){
            if(S.substring(i, i+n).equals(pat)){
                list.add(i+1);
            }
        }
        if(list.size() == 0){
            list.add(-1);
            return list;
        }
        return list;
    }
}
