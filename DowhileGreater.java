//Write a program to enter the numbers till the user wants and at the end the program should 
//display the largest and smallest numbers entered.
import java.util.*;
class whichisgreaterandtellagain{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int max, min;
        int tell;
        do{
            System.out.println("Enter two numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                max=a;
                min=b;
                System.out.println("max value"+max);
                System.out.println("min value"+min);
            }else{
                max=b;
                min=a;
                System.out.println(max);
                System.out.println(min);
            }
            System.out.println("Do you want to do it again if yes type 1 otherwise 0");
            tell=sc.nextInt();
        }while(tell==1);
    }
}
