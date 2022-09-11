public class NumberPyramid {
    public static void numberPyramid(int n){
        for(int i=n;i>=1;i--){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
     public static void main (String[] args) {
         numberPyramid(4);
     }
    
}
