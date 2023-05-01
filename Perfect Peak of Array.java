// Perfect Peak of Array
// Programming
// Arrays
// Easy
// 49.6% Success

// 257

// 19

// Bookmark
// Asked In:
// Problem Description
 
 

// Given an integer array A of size N.

// You need to check that whether there exist a element which is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it.

// If it exists return 1 else return 0.

// NOTE:

// Do not consider the corner elements i.e A[0] and A[N-1] as the answer.


// Problem Constraints
// 3 <= N <= 105

// 1 <= A[i] <= 109



// Input Format
// First and only argument is an integer array A containing N integers.



// Output Format
// Return 1 if there exist a element that is strictly greater than all the elements on left of it and strictly  smaller than all the elements on right of it else return 0.



// Example Input
// Input 1:

//  A = [5, 1, 4, 3, 6, 8, 10, 7, 9]
// Input 2:

//  A = [5, 1, 4, 4]


// Example Output
// Output 1:

//  1
// Output 2:

//  0


// Example Explanation
// Explanation 1:

//  A[4] = 6 is the element we are looking for.
//  All elements on left of A[4] are smaller than it and all elements on right are greater.
// Explanation 2:

//  No such element exits.

public class Solution {
    public int perfectPeak(int[] A) {
        int n = A.length;
        
        int[] larger = new int[n];
        int maxSofar = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxSofar = Math.max(maxSofar, A[i]);
            larger[i] = maxSofar;
        }
        
        int[] smaller = new int[n];
        int minsofar = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            minsofar = Math.min(minsofar, A[i]);
            smaller[i] = minsofar;
        }
        
        for(int i=1; i<n-1; i++){
            if(A[i] > larger[i-1] && A[i] < smaller[i+1]){
                return 1;
            }
        }
        return 0;
    }
}
