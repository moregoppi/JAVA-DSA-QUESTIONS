// String Permutations
// EasyAccuracy: 48.33%Submissions: 46K+Points: 2
// Given a string S. The task is to find all permutations (need not be different) of a given string.

// Example 1:

// Input:
// S = AAA
// Output: AAA AAA AAA AAA AAA AAA
// Explanation: There are total 6 permutations, as given in the output.
// Example 2:

// Input:
// S = ABSG
// Output: ABGS ABSG AGBS AGSB ASBG ASGB
// BAGS BASG BGAS BGSA BSAG BSGA GABS
// GASB GBAS GBSA GSAB GSBA SABG SAGB
// SBAG SBGA SGAB SGBA
// Explanation: There are total 24 permutations, as given in the output.
// Your Task:
// This is a function problem. You only need to complete the function permutation that takes S as parameter and returns the list of permutations in lexicographically increasing order. The newline is automatically added by driver code.

// Constraints:
// 1 ≤ size of string ≤ 5

// Expected Time Complexity: O(N * N!), N = length of string.
// Expected Auxiliary Space: O(1)




//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> permutations = new ArrayList<>();
        char[] chars = S.toCharArray();
        generatePermutations(chars, 0, permutations);
        Collections.sort(permutations);
        return permutations;
    }
    
    private void generatePermutations(char[] chars, int index, List<String> permutations) {
        if (index == chars.length - 1) {
            permutations.add(new String(chars));
            return;
        }
        
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutations(chars, index + 1, permutations);
            swap(chars, index, i); // Backtrack (restore the original order)
        }
    }
    
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
	   
}
