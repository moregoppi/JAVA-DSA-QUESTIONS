//In this code we have a String And we have given a value of characters and we have to find the total of the string
//Character Values are I=1, V=5, X=10, L=10, C=100, D=500, M=1000
//EXAMPLE INPUT:- "XV1" OUTPUT:- 16   OR INPUT:- "LVIII" OUTPUT:- 58 
import java.util.*;
public class RomanToInteger
{
    public static void printIt(String str){
        int sum=0;
        //we are checking every character of string 
        for(int i=0;i<str.length();i++){
            //here that character which we get from string converting to character
            char a = (char)str.charAt(i);
            if(a=='I'){
                sum++;
            }else if(a=='V'){
                sum+=5;
	    }else if(a=='X'){
                sum+=10;
            }else if(a=='L'){
                sum+=50;
            }else if(a=='C'){
                sum+=100;
            }else if(a=='D'){
                sum+=500;
            }else if(a=='M'){
                sum+=1000;
            }
            
        }
        System.out.println(sum);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)
		String str=sc.next();
		printIt(str);
	}
}
