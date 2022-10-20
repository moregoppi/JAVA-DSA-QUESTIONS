import java.util.Stack;

//the next greatest element of some element x in an array is the first greater element that is
//to the right x is the same array.
public class greatestelement
{
    //next greater in left side
    // public static void nextGreaterInLeftSide(int arr[], int nextGreater[]){
    //     Stack<Integer> s = new Stack<>();
    //     for(int i=0; i<arr.length; i++){
    //         //1 while
    //         while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
    //             s.pop();
    //         }
    //         //2 if-else
    //         if(s.isEmpty()){
    //             nextGreater[i] = -1;
    //         }else{
    //             nextGreater[i] = arr[s.peek()];
    //         }
    //         //3 push in stack
    //         s.push(i);
    //     }
    // }
    //next greater in right side
    public static void nextGreaterInRightSide(int arr[], int nextGreater[]){
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            //3 push in stack
            s.push(i);
        }
    }
    //next smaller left
    // public static void nextSmallerInLeftSide(int arr[], int nextGreater[]){
    //     Stack<Integer> s = new Stack<>();
    //     for(int i=0; i<arr.length; i++){
    //         //1 while
    //         while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
    //             s.pop();
    //         }
    //         //2 if-else
    //         if(s.isEmpty()){
    //             nextGreater[i] = -1;
    //         }else{
    //             nextGreater[i] = arr[s.peek()];
    //         }
    //         //3 push in stack
    //         s.push(i);
    //     }
    // }
    // public static void nextSmallerInRightSide(int arr[], int nextGreater[]){
    //     Stack<Integer> s = new Stack<>();
    //     for(int i=arr.length-1; i>=0; i--){
    //         //1 while
    //         while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
    //             s.pop();
    //         }
    //         //2 if-else
    //         if(s.isEmpty()){
    //             nextGreater[i] = -1;
    //         }else{
    //             nextGreater[i] = arr[s.peek()];
    //         }
    //         //3 push in stack
    //         s.push(i);
    //     }
    // }
    //brute force for next greater in right side t.c:-O(n^2)
    // public static void checkGreatestElement(int arr[], int arr1[]){
    //     for(int i=0; i<arr.length; i++){
    //         if(i == arr.length-1){
    //             arr1[i] = -1;
    //         }
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[i]<arr[j]){
    //                 arr1[i] = arr[j];
    //                 break;
    //             }else{
    //                 arr1[i] = -1;
    //             }
    //         }
    //     }
    // }
	public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreater[] = new int[arr.length];

        nextGreaterInRightSide(arr,nextGreater);

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
	}
}
