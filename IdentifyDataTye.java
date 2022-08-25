//In this a character id given to us and we have to check it is lower case aplhabate or upper case or a intger
//Example input:- 'a' output:- "this is a lower case alphabate" input:- 'A' output:- "this is a upper case alphabate" input:- 1 output:- "this is a intger"
import java.util.*;
public class Main
{
	public static void main(String[] args) {
      //here we are taking input form user
	    Scanner sc=new Scanner(System.in);
	    char ch=sc.next().charAt(0);
      //here we checking the character on their ascii value
	    if(65<=ch&&ch<=90){
            System.out.println("this is upper case");
        }else if(97<=ch&&ch<=122){
            System.out.println("this is lower case");
        }
        else{
            System.out.println("this is integer");
        }
	}
}
