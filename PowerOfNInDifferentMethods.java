import java.util.*;
public class PowerOfNInDifferentMethods. {
    //time complexity O(n)    
    public static int powerN(int a,int n){
        if(n==0){
            return 1;
        }
        return a *powerN(a,n-1);
    }
    //time complexity is 2^log n = O(n)
    public static int powerN2(int a,int n){    
        if(n==0){
            return 1;
        }
        int halfsquare=powerN2(a,n/2)*powerN2(a,n/2);
        if(n%2!=0){
            return a*halfsquare;
        }
        return halfsquare;
    }
    //this is omtimised method
    //time complexity & space complexity is O(log n) for both
    public static int powerN3(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=powerN3(a,n/2);
        int halfsquare=halfpower*halfpower;
        if(n%2!=0){
            return halfsquare*a;
        }
        return halfsquare;
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for which you want to find the power");
        int a=sc.nextInt();
        System.out.println("Enter the value of power what you wnat to give to calculate");
        int n=sc.nextInt();
		System.out.println(powerN3(a,n));
		System.out.println(powerN2(a,n));
		System.out.println(powerN(a,n));
	}
}
