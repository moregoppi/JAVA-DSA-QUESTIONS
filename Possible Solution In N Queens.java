
public class nqueensyesorno {
    public static boolean isSafe(char board[][], int row,int col){
        //for upward
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //for right up diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //for left up diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char board[][],int row){
        if(row==board.length){
            //printBoard(board);
            return true;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueen(board, row+1)){  //recursion function
                    return true;
                }
            }
            board[row][j]='x';   //backtracking step
        }
        return false;
    }
    public static void printBoard(char  board[][]){
        System.out.println("----------Chess Board----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
            System.out.println();
        }
        if(nQueen(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
    }
}
