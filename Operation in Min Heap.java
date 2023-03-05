import java.util.*;
public class operationinminheap { 
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        // for min heap
        // add function
        public void add(int data){
            list.add(data);   //O(1)

            int x = list.size()-1;  //this is children index
            int par = (x - 1) / 2;    //this is parent index

            while(list.get(par) > list.get(x)){   //O(log n)
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        // peek function
        public int peek(){
            return list.get(0);
        }

        // remove function : minimum index will be removed from the heap because its min heap
        public int remove(){
            int data = list.get(0);

            // Step 1 : swap first and last index of list because this will help to reduce time complexity
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, data);

            // step 2: delete last index
            list.remove(list.size()-1);

            // step 3 : heapify  
            heapify(0);

            return data;
        }
        // heapify is function made by us to correct the heap according to the min heap property
        public void heapify(int i){
            int left = (2*i) + 1;
            int right = (2*i) + 2;
            int minIndex = i;
            
            // first this will check if left index value is between arraylist size or not and then 
            // it check if minIndex value is greater than left index value and minIndex will changed to left index
            if(left < list.size() && list.get(left) < list.get(minIndex)){
                minIndex = left;
            }

            if(right < list.size() && list.get(right) < list.get(minIndex)){
                minIndex = right;
            }

            // here we check if minIndex is same as i than it will not swap values means they satisfy the property
            if(minIndex != i){
                int temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);

                // here we again check for changed value
                heapify(minIndex);
            }
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }

    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(3);
        hp.add(1);
        hp.add(12);
        hp.add(0);

        while(!hp.isEmpty()){
            System.out.println(hp.peek());
            hp.remove();
        }
    }
    
}
