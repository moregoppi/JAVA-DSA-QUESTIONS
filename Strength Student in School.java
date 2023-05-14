// In Peculiar School, the students are admitted on the basis of their strength. The strength of N students is given to you in the form of an array. The PT teacher wants to analyse 2 sets of M students. Help him find the maximum possible difference between the sum of strengths of students in the two groups.
// Note: one student can be a part of more than one group.

// Example 1:

// Input: 
// N = 5, M = 4
// A = {1 2 3 4 5}

// Output:
// 4

// Explanation:
// The maximum four elements are 2,3,4 and 5. 
// The minimum four elements are 1,2,3 and 4. 
// The difference between two sums is 
// (2 + 3 + 4 + 5) - (1 + 2 + 3 + 4) = 4.

// Example 2:

// Input: 
// N = 5, M = 2
// A = {5 8 11 40 15}

// Output:
// 42

// Explanation:
// The difference is (40 + 15) - (5  + 8) = 42.

// Your Task:
// Complete the function diffSum() which takes 3 arguments N, M, and array of elements and returns the maximum difference between the two sets of M elements.


// Constraints:
// 1 <= M <= N <= 10^5
// 1 <= element of array <= 10^5


class Main{
  public static int diffSum(int n, int m, int arr[]){
    Arrays.sort(arr);
    int front = 0;
    for(int i=0; i<m; i++){
      front += arr[i];
    }
    for(int i=n-1; i>=n-m; i--){
      back += arr[i];
    }
    
    return back - front;
  }
}
