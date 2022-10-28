import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int nums[] = {-4,-1,0,3,10};
		int arr[] = new int[nums.length];
        int k=0;
        for(int i=0; i<arr.length; i++){
            arr[k] = nums[i] * nums[i];
            k++;
        }

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
	}
}
