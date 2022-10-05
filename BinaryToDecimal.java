public class binarytodecimal {
    public static void binTodec(int n){
        int power=0;
        int decnum=0;
        while(n>0){
            int ld=n%10;     //this will calculate the last digit
            decnum=decnum+(ld*(int)Math.pow(2, power));
            power++; 
            n=n/10;   //this is help to remove the last digit which we calaculate
        }
        System.out.println(decnum);
    }
    public static void main(String[] args) {
        binTodec(101);
    }   
}
