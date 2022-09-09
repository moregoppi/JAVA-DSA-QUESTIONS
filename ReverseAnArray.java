
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
// 	this is the same function but in rescursion form
//     public static void reverseArray(int arr[],int i){
//         //base case if
//         if(i==0){
//             System.out.print(arr[i]);
//             return;
//         }
//         System.out.print(arr[i]+" ");
//         reverseArray(arr,i-1);
            
//     }
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
