import java.util.*;
public class nthfibanoicnumber {
    public static int fibanoicNumber(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fibanoicNumber(n-1);
        int f2=fibanoicNumber(n-2);
        int fn=f1+f2;
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibanoicNumber(n));
    }
}
