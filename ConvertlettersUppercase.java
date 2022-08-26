//in this problem we going to to get an string into  all lower case character and we have to orint the every character of starting word into uppercase
//Example
//input:- "hi my name is gurpreet"             output:-"Hi My Name Is Gurpre I Am Engineer"

import java.util.*;
public class ConvertlettersUppercase { 
    public static void changeIt(String str){
        //here we are  making a string builder to append the str character one by one
        StringBuilder sb=new StringBuilder("");
        //in this we are going to make first letter of string going to be uppercase
        char ch=Character.toUpperCase(str.charAt(0));
        //here we are appending the first character of string into stringbuilder 
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            //here we are checking if its a space we going to append it in stringbuilder and 
            //going to increase the index of str by one and making that character uppercase
            if(str.charAt(i)==' ' && i<str.length()-1){
                //here we are appending the space 
                sb.append(str.charAt(i));
                //here we are increase the index of str by one 
                i++;
                //here we are going to change that character next to space into uppercase character
                sb.append(Character.toUpperCase(str.charAt(i)));
                //if its not space just append that character into string builder
            }else{
                sb.append(str.charAt(i));
            }
        }
        //here we are printing that charcater
        System.out.println(sb.toString());
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //taking input of str from user 
	    String str=sc.nextLine();
	    changeIt(str);
	}
    
}
