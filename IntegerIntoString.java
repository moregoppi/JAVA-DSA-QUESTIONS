//You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.  Use a recursive function to solve this problem.
//NOTE - The digits of thenumber will only be in the range 0-9 and the last digit of a number can’t be 0.Sample Input: 1947 Sample Output: “one nine four seven”
public class Main
{
    static String digit[]={"zero ","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
    public static void changeIt(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        changeIt(n/10);
        System.out.print(digit[lastdigit]);
    }
	public static void main(String[] args) {
	    int str=2010;
	    changeIt(str);
	}
}
