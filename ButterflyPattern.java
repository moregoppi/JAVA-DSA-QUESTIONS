public class advancepattern {
    public static void butterflyPattern(int n){
        for(int i=1;i<=n;i++){
            //stars part1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars part2
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //ulti butterfly 
        for(int i=n;i>=1;i--){
            //stars part1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars part2
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void main (String[] args) {
         butterflyPattern(4);
     }
    
}
