// Next Smallest Palindrome
// HardAccuracy: 19.63%Submissions: 35K+Points: 8
// Applying for Jobs, Now Easier Than Today's Problem! Explore Now

// Given a number, in the form of an array Num[] of size N containing digits from 1 to 9(inclusive). The task is to find the next smallest palindrome strictly larger than the given number.

// Example 1:

// Input:
// N = 11
// Num[] = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2}
// Output: 9 4 1 8 8 0 8 8 1 4 9
// Explanation: Next smallest palindrome is
// 9 4 1 8 8 0 8 8 1 4 9
// Example 2:

// Input:
// N = 5
// Num[] = {2, 3, 5, 4, 5}
// Output: 2 3 6 3 2
// Explanation: Next smallest palindrome is
// 2 3 6 3 2
// Your Task:
// Complete the function generateNextPalindrome() which takes an array num, and a single integer n, as input parameters and returns an array of integers denoting the answer. You don't to print answer or take inputs.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 <= N <= 105
// 1 <= Num[i] <= 9



// User function Template for Java

class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
        Vector<Integer> out = new Vector<>();
        for (int digit : num) {
            out.add(digit);
        }

        int i = 0, j = n - 1;

        while (i < j) { // Convert 'out' array into a palindrome
            out.set(j, out.get(i));
            ++i;
            --j;
        }

        boolean isBig = false;
        for (int it = n / 2; it < n; ++it) { // Check if 'out' is greater than 'num'
            if (out.get(it) > num[it]) {
                isBig = true;
                break;
            }
            if (out.get(it) < num[it])
                break;
        }

        if (isBig) // If 'out' is greater, no further operation needed
            return out;

        i = (n % 2) == 1 ? n / 2 : n / 2 - 1; // Mids of the out array
        j = n / 2;

        while (i >= 0) { // Incrementing numbers from the middle to the corners
            if (out.get(i) < 9) {
                out.set(i, out.get(i) + 1);
                out.set(j, out.get(i));
                return out;
            }
            out.set(i, 0);
            out.set(j, 0);
            --i;
            ++j;
        }

        out.set(0, 1); // If all digits are 9, convert to [1, 0, 0, ..., 0, 1]
        out.add(1);

        return out;

    }
}
