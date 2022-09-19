import java.util.*;
public class pairsum2 { 
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int breakingpoint=-1;
        int n = list.size();
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                breakingpoint = i;
            }
        }
        int lp = breakingpoint+1;
        int rp = breakingpoint;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1) % n;
            }else{
                rp= (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        System.out.println(pairSum2(list, 16));
    }
}
