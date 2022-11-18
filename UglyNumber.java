class Solution {
    public boolean isUgly(int n) {
        if(n ==0){
            return false;
        }
        if(n == 1){
            return true;
        }
        for(int i=2; i<=5; i++){
            if(i!=4){
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n == 1){
            return true;
        }else{
            return false;
        }
    
    }
}
