
public class swaptwonumbers {
    public static void main(String[] args) {
        int a=2, b=6;
        System.out.println("before a and b respectively are "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping a and b respectively are "+a+" "+b);
    }    
}
