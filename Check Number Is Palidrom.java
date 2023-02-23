public class checknumberispalidromenumber {
    
    public static int rEverse(int n){
        int reminder=0;
        
        while(n>0){
            int lastdigit=n%10;    
            reminder=(reminder*10)+lastdigit;
            n=n/10;
        }
        return reminder;
    }
    public static boolean checkIt(int n){
        if(n==rEverse(n)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("This number is "+checkIt(122)+" palidrome number");
    }   
}
