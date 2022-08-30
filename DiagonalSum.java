import java.util.*;
public class Main
{
    public static int diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            int j=arr[0].length-i-1;
            if(i!=j){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
        
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("how many rows do you want to take in 2d array");
	    int n=sc.nextInt();
	    System.out.println("how many columns do you want to take in 2d array");
	    int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Give the elements of 2D array");
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 arr[i][j]=sc.nextInt();
             }
          }
        System.out.println(diagonalSum(arr));
        
	}
}
