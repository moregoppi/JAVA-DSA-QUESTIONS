import java.util.*;
public class findnumberx{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter which number do you want to find");
        int number=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(array[i][j]==number){
                    System.out.println("number present at"+i+","+j);
                }
            }
        }
    }
}
