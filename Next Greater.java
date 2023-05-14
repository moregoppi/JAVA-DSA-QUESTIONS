// NEXTGREATER
// Programming
// Checkpoint: Level 4
// Easy
// 64.1% Success

// 32

// 3

// Bookmark
// Given an array, find the next greater element G[i] for every element A[i] in the array.  The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array. 

// More formally,

// G[i] for an element A[i] = an element A[j] such that 
//     j is minimum possible AND 
//     j > i AND
//     A[j] > A[i]
// Elements for which no greater element exist, consider next greater element as -1.

// Example:

// Input : A : [4, 5, 2, 10]

// Output : [5, 10, 10, -1]

// Example 2:

// Input : A : [3, 2, 1]

// Output : [-1, -1, -1]


public class Solution {
    public int[] nextGreater(int[] A) {
        int[] arr = new int[A.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i=A.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= A[i]){
                s.pop();
            }
            arr[i] = s.isEmpty()? -1 : s.peek();
            s.push(A[i]);
        }
        
        return arr;
    }
}
