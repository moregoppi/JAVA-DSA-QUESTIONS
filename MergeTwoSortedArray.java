import java.util.*;
public class Main {
    public static void mergeArrays(int nums1[], int nums2[], int arr[]){
        int k = 0;
        for(int i=0; i<nums1.length; i++){
            arr[k] = nums1[i];
            k++;
        }
        
        for(int i=0; i<nums2.length; i++){
            arr[k] = nums2[i];
            k++;
        }
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int nums1[] = {1,2};
	    int nums2[] = {3,4};
	    int p1 = nums1.length;
        int p2 = nums2.length;
		int arr[] = new int[p1+p2];
        
        mergeArrays(nums1, nums2, arr);
        
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
