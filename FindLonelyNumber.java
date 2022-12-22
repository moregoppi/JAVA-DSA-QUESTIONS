import java.util.*;
public class Main
{
     public static void lonelyNum(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            boolean lonely = false;
            if(list.size()==1){
                System.out.println(list.get(i));
                break;
            }
            for(int j=0; j<list.size(); j++){
                if(i!=j){
                    if(list.get(i) == list.get(j)){
                        lonely = true;
                    }
                    
                    }if(i!=0){
                        if(list.get(i)-1==list.get(j)){
                            lonely = true;
                        }
                    }
                    if(i!=list.size()-1){
                        if(list.get(i)+1==list.get(i+1)){
                            lonely = true;
                        }
                    }
            }
            
            if(lonely == false){
                System.out.println(list.get(i));
            }
        }
     }
    
    
	public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(3);
        list1.add(9);
       
        System.out.println(list1);
        lonelyNum(list1);
    }    
}
