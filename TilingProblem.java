public class tilingproblem {
    public static int totalWays(int n){
        if(n==0||n==1){
            return 1;
        }
        int vertical=totalWays(n-1);
        int horizontal=totalWays(n-2);
        int total=vertical+horizontal;
        return total;
    }
	public static void main(String[] args) {
		int n=3;
		System.out.println(totalWays(n));
	}    
}
