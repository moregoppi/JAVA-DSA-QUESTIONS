import java.util.ArrayList;
public class function {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        //this is add function
        //time complexity is O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //to add at specific index a specific number
        list.add(1,12);
        System.out.println("add element function");
        System.out.println(list);
        //get function
        // list.get(index value which you want to check)
        //time complexity is O(1)
        System.out.println("get element function");
        int element=list.get(1);
        System.out.println(element);
        //set element
        //list.set(index, number which you have to set)
        //time complexity O(n)
        System.out.println("set element function");
        list.set(3, 10);
        System.out.println(list);
        //remove element function
        //list.remove(index number which you want to remove)
        //time complexity O(n)
        System.out.println("remove element function");
        list.remove(4);
        System.out.println(list);
        //to check the element present in that arraylist
        //if element is present it will print true, if its not present it will print false
        System.out.println("Contain function");
        System.out.println("is element present = "+list.contains(1));
        System.out.println("is element present = "+list.contains(13));
        //size function this will print the size of the arraylist
        System.out.println("size function");
        System.out.println(list.size());
        //to print array list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //check the maximum
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max, list.get(i));
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
        }
        System.out.println("max element "+max);
    }
}
