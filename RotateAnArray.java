
import java.util.*;
public class Main
{
    public static void rotateArray(int arr[], int p, int n){
        int newarr[]=new int[n];
        int q=0;
        for(int i=p;i<arr.length;i++){
            newarr[q]=arr[i];
            q=q+1;
            if(i==arr.length-1){
                for(int j=0;j<p;j++){
                    newarr[q]=arr[j];
                    q=q+1;
                }
            }
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int p=2;
        int n=7;
		int arr[]={1,2,3,4,5,6,7};
		
		rotateArray(arr,p,n);
	}
}
