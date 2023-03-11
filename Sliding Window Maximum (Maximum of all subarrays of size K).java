import java.util.PriorityQueue;

public class slidingwindow {
    static class Element implements Comparable<Element>{
        int num;
        int idx;

        public Element(int num, int idx){
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Element p2){
            return p2.num - this.num;
        }
    }

    // time complexity O(n logn)
    public static void usingPriorityQueue(int[] arr, int k, int[] result){
        PriorityQueue<Element> pq = new PriorityQueue<>();

        for(int i=0; i<k; i++){
            pq.add(new Element(arr[i], i));
        }

        result[0] = pq.peek().num;

        for(int i=k; i<arr.length; i++){
            while(pq.size() > 1 && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Element(arr[i], i));
            result[i-k+1] = pq.peek().num;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};

        int k = 3;

        // this is how we store value for answer
        int[] result = new int[arr.length-k+1];
        
        usingPriorityQueue(arr, k, result);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
