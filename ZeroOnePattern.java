public class ZeroOnePattern {
    
    
    public static void zeroOnepattern(int n){
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                int sum=i+j;
                //for 1
                if(sum%2==0){
                    System.out.print(1);
                }
                //for 0
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    
     public static void main (String[] args) {
         zeroOnepattern(4);
         System.out.println();
     }
    
}
