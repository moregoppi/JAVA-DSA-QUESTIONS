Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
  
import java.util.Arrays;
import java.util.*;
public class Main
{
    public static void kThNumber(int arr[], int k){
        Arrays.sort(arr);
        int largest=arr[arr.length-k];
        System.out.println(k+" largest element is "+largest);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("what size of array do you want");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter the elemnt of array");
	    for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("which largest elemen you want to find");
        int k=sc.nextInt();
	    kThNumber(arr,k);
	}
}
