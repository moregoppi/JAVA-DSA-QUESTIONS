// Get Mode Array Updates
// Programming
// Ninja
// Medium
// 20.3% Success

// 12

// 2

// Bookmark
// You are given an array of N positive integers, A1, A2 ,…, AN.   

// Also, given a Q updates of form:

// i j: Update Ai = j. 1 ≤ i ≤ N.
// Perform all updates and after each such update report mode of the array. Therefore, return an array of Q elements, where ith element is mode of the array after ith update has been executed.

// Notes

// Mode is the most frequently occuring element on the array.
// If multiple modes are possible, return the smallest one.
// Update array input is via a Q*2 array, where each row represents a update.
// For example,

// A=[2, 2, 2, 3, 3]

// Updates=    [ [1, 3] ]
//             [ [5, 4] ]
//             [ [2, 4] ]

// A = [3, 2, 2, 3, 3] after 1st update.
// 3 is mode.

// A = [3, 2, 2, 3, 4] after 2nd update.
// 2 and 3 both are mode. Return smaller i.e. 2.

// A = [3, 4, 2, 3, 4] after 3rd update.
// 3 and 4 both are mode. Return smaller i.e. 3.

// Return array [3, 2, 3].
// Constraints    

// 1 ≤ N, Q ≤ 105    

// 1 ≤ j, Ai ≤ 109


public class Solution {
    public static int most(int[] arr){
        int mostfreq = 0;
        int mostOcc = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
            int count = mp.get(arr[i]);
            
            if(count > mostfreq){
                mostfreq = count;
                mostOcc = arr[i];    
            }else if(count == mostfreq){
                mostfreq = count;
                mostOcc = Math.min(mostOcc, arr[i]);
            }
        }
        return mostOcc;
    }
    public int[] getMode(int[] A, int[][] B) {
        int[] ans = new int[B.length];
        
        for(int i=0; i<B.length; i++){
            int index = B[i][0];
            int val = B[i][1];
            
            A[index-1] = val;
            
            int mode = most(A);
            
            ans[i] = mode;
        }
        
        return ans;
    }
}
