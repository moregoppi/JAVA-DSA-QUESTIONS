public class indiancoins {
    public static void main(String[] args) {
        int money[] = {1,10,20,50,100,200,500,2000};
		int val = 590;
		int coin = 0;
		
		for(int i=money.length-1; i>=0;i--){
	        if(val >= money[i]){
	            while(money[i] <= val){
		            val -= money[i];
		            System.out.print(money[i]+" ");
		            coin++;
	            }
	        }
	    }
		System.out.println();
		
		System.out.println(coin);
    }
}
