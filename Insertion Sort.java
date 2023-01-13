import java.util.*;
public class insertionsort {
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=1;i<array.length;i++){    //too run in unsorted array
            int current=array[i];       
            int j=i-1;                 // first element of unsorted part
            while(j>=0 && current < array[j]){   //when array[j] is greater than current element then we can inserte it
                array[j+1]=array[j];          //here we are inserting the element the element
                j--;
            }
            array[j+1]=current;
        }
        printArray(array);
    }
}
