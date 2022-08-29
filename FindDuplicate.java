import java.util.*;
public class Main
{
    public static boolean finDuplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
          int find=arr[i];
          if(arr[i]==arr[i+1]){
            return true;
          }
        }
      return false;
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Give input as integer");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(finDuplicate(arr));

		
   }
}
