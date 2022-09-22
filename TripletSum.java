//You have been given a random integer array/list(ARR) and a number X. 
//Find and return the number of triplets in the array/list which sum to X.
import java.util.*;
public class tripletsum {
    
    public static int findTriplet(int[] arr, int x) {
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count=+1;
                    }
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many arrays do you want to take");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            System.out.println("what size do you want to print for array");
            int size=sc.nextInt();
            int[] array=new int[size];
            for(i=0;i<size;i++){
                array[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int ans=findTriplet(array,x);
            System.out.println(ans);
        }
    }

}
