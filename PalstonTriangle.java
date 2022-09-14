public class advancepattern {
    public static void palstonTriangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
     public static void main (String[] args) {
         palstonTriangle(4);
     }
    
}
