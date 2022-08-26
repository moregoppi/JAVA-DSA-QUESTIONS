//Maximum and minimum of an array and find its sum
//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum elements in the array.
//Examples
// Input:
// N = 5
// A[] = {-2, 1, -4, 5, 3}
// Output: 1
// Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
// Input:
// N = 4
// A[]  = {1, 3, 4, 1}
// Output: 5
// Explanation: min = 1, max = 4. Sum = 1 + 4 = 5

import java.util.Arrays;
import java.util.*;
public class Maximumandminimum {
    public static void takeInput(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void sUm(int arr[]){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int sum=max+min;
        System.out.println(sum);
    }
	public static void main(String[] args) {
	   System.out.println("what size of array do you want");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
       int arr[]=new int[n];
       takeInput(arr);
       sUm(arr);
	}    
}
