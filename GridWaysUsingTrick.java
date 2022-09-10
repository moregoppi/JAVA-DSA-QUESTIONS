//in this we have to calculate the number of possible ways to reach the end of matrix we can only move in two directions i.e. right and down
public class gridways {
    //this is trick to find the total ways
    //time complexity mof this O(n)
    //(n-1+m-1)! / (n-1)! (m-1)!
     public static int totalWays2(int n){
         if(n==0){
             return 1;
         }
         return n*totalWays2(n-1);
     }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(totalWays(n, m, 0, 0));
          int a=totalWays2(n-1);
          int b=totalWays2(m-1);
          int c=totalWays2(n-1+m-1);
          int totalwaysis=c/(a*b);
          System.out.println(totalwaysis);
    }
}
