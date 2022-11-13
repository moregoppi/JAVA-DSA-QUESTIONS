
public class Main
{
	public static void main(String[] args) {
		int amount = 1350;
		 
		while(amount!=0){
		    if(amount >= 100){
		        System.out.println("amount of 100 ruppes notes are "+amount/100);
		        amount %= 100;
		    }else if(amount >= 50){
		        System.out.println("amount of 50 ruppes notes are "+amount/50);
		        amount %= 50;
		    }else if(amount >= 20){
		        System.out.println("amount of 20 ruppes notes are "+amount/20);
		        amount %= 20;
		    }else{
		        System.out.println("amount of 1 ruppe coins are "+amount/1);
		        amount %= 1;
		    }    
		}
	}
}
