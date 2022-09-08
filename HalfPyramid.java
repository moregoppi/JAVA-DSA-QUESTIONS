public class Main {
    
    public static void puthaHalfpyramid(int n){
        for(int i=n;i>=1;i--){
            //spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
     public static void main (String[] args) {
         puthaHalfpyramid(4);
         System.out.println();
     }
    
}
