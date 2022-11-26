//Given three value and we need to find maxChocolates
//1. money:- for buy chocolate
//2. cost:- cost of one chocolate
//3. wraper:- how many wrapers you need to buy one chocolate
public class Main
{
    public static int maxchoclate(int cost, int wraper, int money){
        if(money < cost){
            return 0;
        }
        int choc = money / cost;
        choc = choc + (choc - 1)/(wraper - 1);
        return choc;
    }
	public static void main(String[] args) {
	    int cost = 1; //cost of one choclate
		int wraper = 3; //2 wraper = 1 choclate
		int money = 15; 
		System.out.println(maxchoclate(cost, wraper, money));
	}
}
