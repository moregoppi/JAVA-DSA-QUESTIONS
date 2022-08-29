//Checking number even or odd using bit manuplation
import java.util.*;
public class Main
{
    public static void findEvenOrOdd(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Its a even number");
        }else{
            System.out.println("Its a odd number");
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the element you want to find is odd or even");
	    int n=sc.nextInt();
	    findEvenOrOdd(n);
	}
}
