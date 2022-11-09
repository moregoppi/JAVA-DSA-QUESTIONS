import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=2; i<=n; i++){
	        if(n % i == 0){
	            int count = 0;
	            while(n%i==0){
	                n = n/i;
	                count++;
	            }
	            System.out.println(i+"^"+count);
	        }
	    }
	}
}
