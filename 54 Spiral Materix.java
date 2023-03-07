//1 2 3 
//4 5 6 
//7 8 9 

// Firstly :- Top  1,2,3
// Secondly :- 6
// thirdly :- 9,8,7
// fourthly :- 4,5


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();

        int totalelements = matrix.length * matrix[0].length;
        while(startrow <= endrow && startcol <= endcol){

            // (top) left to right
            for(int i=startcol; i<=endcol && list.size() < totalelements; i++){
                list.add(matrix[startrow][i]);
            }

            // (right) top to buttom
            for(int i=startrow+1; i<=endrow-1 && list.size() < totalelements; i++){
                list.add(matrix[i][endcol]);
            }

            // (bottum) right to left;
            for(int i=endcol; i>=startcol && list.size() < totalelements; i--){
                list.add(matrix[endrow][i]);
            }

            // (left) bottum to top
            for(int i=endrow-1; i>=startcol+1 && list.size() < totalelements; i--){
                list.add(matrix[i][startcol]);
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return list;
    }
}
