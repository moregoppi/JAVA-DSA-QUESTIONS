import java.util.*;
public class powerofx {
    public static void pRoduct(int x,int n,int product){
        if(n==0){
            System.out.print(product);
            return;
        }
        product*=x;
        pRoduct(x, n-1,product);
    }
    public static int powerOFx(int n,int x){
        if(n==0){
            return 1;
        }
        int fnm1=powerOFx(n-1, x);
        int product=x*fnm1;
        return product;
    }
    public static int optimizedMethod(int n,int x){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedMethod(n/2, x);
        int halfpowerSq=halfPower*halfPower;
        //n is odd
        if(n%2!=0){
            halfpowerSq=x*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what number do you want as base");
        int x=sc.nextInt();
        System.out.println("what number do you want as power");
        int n=sc.nextInt();
        // pRoduct(x, n, 1);
        System.out.println(optimizedMethod(n, x));
    }
}
