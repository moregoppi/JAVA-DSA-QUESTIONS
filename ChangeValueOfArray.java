import java.util.*;
public class ChangeValueOfArray{
    public static void changeAraay(int arr[],int i,int value){
        //i for changing array's value and value is which value do you want to assign
        //base case 
        if(i==arr.length){
            printArray(arr);
            return;
        }
        //recursion (kaam jo krna hai)
        arr[i]=value;
        changeAraay(arr,i+1,value+1);  
        //backtracking step is always written after the recursion step
        arr[i]=arr[i]-2;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("what size of array do you want");
	    int n=sc.nextInt();
	    System.out.println("from which value do you want to array start");
	    int value=sc.nextInt();
		int arr[]=new int[n];
		changeAraay(arr,0,value);
		printArray(arr);
	}
}
