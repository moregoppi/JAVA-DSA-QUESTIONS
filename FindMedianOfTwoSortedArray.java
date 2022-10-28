import java.util.*;
class Main {
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
    static int nums1[] = {1,3};
    static int nums2[] = {2};
    public static void main(String[] args) {
        int arr[] = new int[nums1.length+nums2.length];
        mergeArrays(nums1, nums2, arr);
        if(arr.length % 2 != 0){
            System.out.println(arr[arr.length/2]);
        }else{
            double am = arr[arr.length/2];
            double bm = arr[(arr.length/2)-1];
            System.out.println((bm+am)/2);
        }
    }
}
