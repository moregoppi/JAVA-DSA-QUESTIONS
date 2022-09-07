public class HollowPattern {
    public static void hallowPattern(int n,int m){
        for(int i=1;i<=n;i++){
            //stars 
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
     public static void main (String[] args) {
         hallowPattern(4,4);
         
     }
    
}
