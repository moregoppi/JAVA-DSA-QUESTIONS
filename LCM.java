
import java.util.*;
public class Main
{
    public static void lcm(int n1, int n2){
        if(n1 == 0 && n2>n1){
            System.out.println(n2);
            return;
        }
        if(n2 == 0 && n1>n2){
            System.out.println(n2);
            return;
        }
        int gcd = -1;
	    for(int i=2; i<=n1 && i<=n2; i++){
	        if(n1%i==0 && n2%i==0){
	            gcd = i;
	        }
	    }
	    int lcm = (n1*n2)/gcd;
	    System.out.println(lcm);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    lcm(n1,n2);
	}
}
