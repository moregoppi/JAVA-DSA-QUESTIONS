// Array Sum
// Programming
// Arrays
// Medium
// 64.8% Success

// 82

// 13

// Bookmark
// Asked In:
// Problem Description
 
 

// You are given two numbers represented as integer arrays A and B, where each digit is an element.

// You have to return an array which representing the sum of the two given numbers.

// The last element denotes the least significant bit, and the first element denotes the most significant bit.



// Problem Constraints
// 1 <= |A|, |B| <= 105
// 0 <= Ai, Bi <= 9


// Input Format
// The first argument is an integer array A. The second argument is an integer array B.


// Output Format
// Return an array denoting the sum of the two numbers.


// Example Input
// Input 1:
// A = [1, 2, 3]
// B = [2, 5, 5]
// Input 2:

// A = [9, 9, 1]
// B = [1, 2, 1]


// Example Output
// Output 1:
// [3, 7, 8]
// Output 2:

// [1, 1, 1, 2]


// Example Explanation
// Explanation 1:
// Simply, add all the digits in their place.
// Explanation 2:

// 991 + 121 = 1112
// Note that the resultant array size might be larger.


public class Solution {
    public ArrayList<Integer> addArrays(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n1 = A.size();
        int n2 = B.size();
        ArrayList<Integer> list = new ArrayList<>();
        
        int carry = 0;
        int i = n1-1;
        int j = n2-1;
        while(i>=0 || j>=0){
            int x = (i >= 0)? A.get(i) : 0;
            int y = (j >= 0)? B.get(j) : 0;
            int num = x + y + carry;
            int lastdigit = num % 10;
            list.add(lastdigit);
            carry = num / 10;
            if(i >= 0){
                i--;
            }
            if(j >= 0){
                j--;
            }
        }
        
        if(carry > 0){
            list.add(1);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int l=list.size()-1; l>=0; l--){
            ans.add(list.get(l));
        }
        
        return ans;
    }
}
