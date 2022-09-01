public class Main
{
    
    public static void fibanoicSeries(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(a+" ");
        fibanoicSeries(b,c,n-1);
    }
	public static void main(String[] args) {
		int n=10;
		fibanoicSeries(0,1,n);
	}
}
