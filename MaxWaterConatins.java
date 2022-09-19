import java.util.ArrayList;

public class containerwithmostwater { 
    //timecomplexity is O(n^2)
    public static int bruteForce(ArrayList<Integer> list){
        int waterConatin=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int width=j-i;
                int height=Math.min(list.get(i),list.get(j));
                int currentwater=height*width;
                waterConatin=Math.max(waterConatin,currentwater);
            }
        }
        return waterConatin;
    }

    // 2 pointer approach
    //timecomplexity is o(n)
    public static int optimiseMethod(ArrayList<Integer> list){
        int waterConatin = 0;
        int leftpointer = 0;
        int rightpointer = list.size()-1;
        while(leftpointer < rightpointer){
            //calculating water contain
            int width = rightpointer - leftpointer;
            int height = Math.min(list.get(leftpointer), list.get(rightpointer));
            int currentwater =width*height;
            waterConatin=Math.max(waterConatin, currentwater);
            
            //update pointer
            if(list.get(leftpointer) <list.get(rightpointer)){
                leftpointer++;
            }else{
                rightpointer--;
            }
        }
        return waterConatin;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(bruteForce(list));
        System.out.println(optimiseMethod(list));
    }
    
}
