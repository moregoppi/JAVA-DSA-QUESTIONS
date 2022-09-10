//in this we have to calculate the number of possible ways to reach the end of matrix we can only move in two directions i.e. right and down
public class gridways {
    //its time complexity is O(2^n+m)  this is very high time complexity
    public static int totalWays(int n,int m,int i,int j){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }
        //downard
        int way1=totalWays(n, m, i+1, j);
        //righ direction
        int way2=totalWays(n, m, i, j+1);
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(totalWays(n, m, 0, 0));
    }
}
