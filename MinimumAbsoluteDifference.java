//Given two arrays A and B of equal length n. Pair each element of array A to an element
//in array B, such that sum of absolute difference of all pairs is minimum
import java.util.*;
public class minimumabsolutedifference {
    public static void main(String[] args) {
        int a[] = {2,4,1};
        int b[] = {4,1,3};
        Arrays.sort(a);
        Arrays.sort(b);
        int dif = 0;
        for(int i=0; i<a.length; i++){
            dif += (int)Math.abs(a[i]-b[i]);
        }
        System.out.println(dif);
    }
}
