import java.util.Scanner;
public class sumofarray {
	
	public static void sum(int[] arr) {
		//Your code goes here
        int sum = 0;
        for(int x:arr){
            sum+=x;
        }
        System.out.println("sum of all elemnt of array = "+sum);
        return;
    	}
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element at "+ i +"th position");
			arr[i] = s.nextInt();
    }
        sum(arr);
    }
}
