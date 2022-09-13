public class Main {
    public static void bonusclassPatternOne(int n){
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
     public static void main (String[] args) {
         bonusclassPattern(4);
     }
    
}
