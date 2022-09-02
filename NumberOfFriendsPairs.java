public class NumberOfFriendPairs {
    public static int friendPairs(int n){
        if(n==1||n==2){
            return n;
        }
        int single=friendPairs(n-1);   //for single 
        int onepair=friendPairs(n-2);  //for one person pair
        int pairs=(n-1)*onepair;    //same person pair with other people pairing
        int totalpairs=single+pairs;
        return totalpairs;
    }
    public static void main (String[] args) {
        int n=3;
        System.out.println(friendPairs(n));
    }    
}
