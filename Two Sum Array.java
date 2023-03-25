// Two Sum Given an array of integers arr[] and an integer target,
// return indices of the two numbers such that they add up to target. You may assume that each input would have
// exactly one solution, and you may not use the same element twice.You can return the answer in any order.
// Sample Input 1: arr = [2, 7, 11, 15], target = 9Sample Output 1: [0, 1]As arr[0] + arr[1] == 9, we return [0, 1].
// Sample Input 2: arr = [3,2,4], target = 6Sample Output 2: [1, 2]
import java.util.*;
public class Main
{
    public static void findIt(int[] arr, int size, int sum){
        int l = 0;
        int r = size-1;
        Arrays.sort(arr);
        while(l < r){
            if(arr[l] + arr[r] == sum){
                System.out.println(arr[l]+" "+arr[r]);
                return;
            }else if(arr[l] + arr[r] < sum){
                l++;
            }else{
                r--;
            }
        }
    }
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int sum = 9;
		int size = arr.length;
		
		findIt(arr, size, sum);
	}
}
