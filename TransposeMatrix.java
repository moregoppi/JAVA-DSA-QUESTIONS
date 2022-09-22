//1 2 3 4              //1 5 10
//5 6 7 8         ---> //2 6 11
//10 11 12 13          //3 7 12
                       //4 8 13


import java.util.*;
public class transposeofmatrix {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
