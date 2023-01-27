// 812. Largest Triangle Area
// Easy
// 451
// 1.5K
// Companies
// Given an array of points on the X-Y plane points where points[i] = [xi, yi], return the area of the largest triangle that can be formed by any three different points. Answers within 10-5 of the actual answer will be accepted.

 

// Example 1:


// Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
// Output: 2.00000
// Explanation: The five points are shown in the above figure. The red triangle is the largest.
// Example 2:

// Input: points = [[1,0],[0,0],[0,1]]
// Output: 0.50000



class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        for(int[] A : points){
            for(int[] B : points){
                for(int[] C : points){
                    ans = Math.max(ans, 0.5 * Math.abs(
                    (B[0] - A[0]) * (C[1] - A[1]) -
                    (C[0] - A[0]) * (B[1] - A[1])));
                }
            }
        }
        return ans;
    }
}
