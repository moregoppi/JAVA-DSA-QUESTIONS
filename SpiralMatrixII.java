// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

// Example 1:
// Input: n = 3
// Output: [[1,2,3],[8,9,4],[7,6,5]]
// Example 2:

// Input: n = 1
Output: [[1]]



class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int startrow = 0;
        int endrow = arr.length-1;
        int startcol = 0;
        int endcol = arr[0].length-1;
        int val = 1;

        while(startrow <= endrow && startcol <= endcol){

            //top:- left to right
            for(int i=startcol; i<=endcol; i++){
                arr[startrow][i] = val;
                val++;
            }

            //right:- top to buttom
            for(int i=startrow+1; i<=endcol; i++){
                arr[i][endcol] = val;
                val++;
            }

            //buttom:- right to left
            for(int i=endcol-1; i>=startcol; i--){
                arr[endrow][i] = val;
                val++;
            }

            //right:- buttom to up
            for(int i=endrow-1; i>startrow; i--){
                arr[i][startcol] = val;
                val++;
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return arr;
    }
}
