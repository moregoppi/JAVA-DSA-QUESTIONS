
public class Main
{
    public static void towerOfHanoi(int n,String a,String b,String c){
        //a as starting               b as helping            c as ending
        if(n==1){
            System.out.println(n+" from "+a+" to "+c);
            return;
        }
            towerOfHanoi(n-1,a,c,b); //for two disk changing
            System.out.println(n+" from "+a+" to "+b);
            towerOfHanoi(n-1,b,a,c); ///for three disks changing
    }
	public static void main(String[] args) {
		int n=3;
		towerOfHanoi(n,"A","B","C");
	}
}
