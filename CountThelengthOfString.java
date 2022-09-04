//Write a program to find Length of a String using Recursion.
public class Main
{
    public static void countThelength(String str,int i,int count){
        if(count==0){
            System.out.println(i);
            return;
        }
        if(count==1){
            i++;
            System.out.println(i);
            return;
        }
        i++;
        countThelength(str,i,count-1);
    }
	public static void main(String[] args) {
		String str="a";
		countThelength(str,0,str.length());
		
	}
}
