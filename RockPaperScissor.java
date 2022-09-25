import java.util.*;
import java.util.Random;
public class rockpaperscissor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //0 rock, 1 paper, 2 scissor
        System.out.println("Enter your input");
        int userinput=sc.nextInt();
        Random random= new Random();
        int computinput=random.nextInt(3);
        System.out.println("Computer input is");
        System.out.println(computinput);
        if(userinput==computinput){
            System.out.println("match is Draw");
        }else if(userinput==0 && computinput==2 || userinput==1 && computinput==0 || userinput==2 && computinput==1 ){
            System.out.println("You are win this match");
        }else{
            System.out.println("You are losse this match");
        }
    }
}
