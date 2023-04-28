//this is for no consective one's
public class binarystring { 
    public static void binaryString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(n-1,0,str+"0");  //this is will putt zero
        if(lastplace==0){
            binaryString(n-1,1,str+"1"); //this will put one
        }
    }
	public static void main(String[] args) {
	    int n=3;
	    binaryString(n,0,"");
	}
}
