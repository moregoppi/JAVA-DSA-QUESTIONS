//if n is postive then print the table of n
import java.util.*;
class Main{
    public static void tableOfNumber(int n){
        int sum=0;
        if(n>=0){
            for(int i=1;i<=10;i++){
                sum=n*i;
                System.out.println(sum);
            }
        }else{
            System.out.println("Invalid input");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tableOfNumber(n);
    }
}
