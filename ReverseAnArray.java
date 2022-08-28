
import java.util.*;
public class Main
{
    public static void reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		  int arr[]=new int[n];
		  System.out.println("Give input as integer");
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }
		  reverseArray(arr);
	  	printArray(arr);
		
	}
}
