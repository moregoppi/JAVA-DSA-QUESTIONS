import java.util.*;
public class Main
{
    public static int modularExpotiation(int a,int n,int p){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans%p;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int n=sc.nextInt();
		  int p=sc.nextInt();
		  System.out.println(modularExpotiation(a,n,p));
	}
}
