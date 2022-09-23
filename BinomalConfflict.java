public class binomialcofflict {
    public static int pRoduct(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product*=i;
        }
        return product;
    }
    public static int binomalCoff(int n, int r){
        int n_fact=pRoduct(n);
	    int r_fact=pRoduct(r);
	    int n_r_fact=pRoduct(n-r);
	    int binomial=n_fact/(r_fact*n_r_fact);
        return binomial;
    }
	public static void main(String[] args) {
	    System.out.println(binomalCoff(5, 2));
	}
    
}
