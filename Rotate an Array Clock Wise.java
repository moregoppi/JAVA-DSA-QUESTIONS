// Reverse an array r times clockwise direction
import java.util.*;
public class Main
{
    public static void rotateArray(int[] arr, int r, int n){
        for(int i=0; i<r; i++){
            rotating(arr, n);
        }
    }
    public static void rotating(int[] arr, int n){
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int r = sc.nextInt();
	    
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        rotateArray(arr, r, n);
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
	}
}
