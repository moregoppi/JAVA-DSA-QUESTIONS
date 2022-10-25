// Find the largest rectangular area possible in a given histogram where the largest rectangle
//can be made of a number of contiguous bars whose heights are given in an array. For simplicity, assume that all bars have the same width and the width is 1 unit. 
//Input: histogram = {3, 5, 1, 7, 5, 9}
// Output: 15
import java.util.Stack;

public class macrectangularareainhistogram {
    public static void maxArea(int arr[]){
        int maxarea = 0;
        int nextsmallerleft[] = new int[arr.length];
        int nextsmallerright[] = new int[arr.length];

        //Next smaller element in left
        Stack<Integer> s =new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallerleft[i] = -1;
            }else{
                nextsmallerleft[i] = s.peek();
            }
            s.push(i);
        }
        //Next smaller element in right
        s =new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallerright[i] = -1;
            }else{
                nextsmallerright[i] = s.peek();
            }
            s.push(i);
        }
        //Max area: width = nextsmallerright - nextsmallerleft - 1, height=arr[i]
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int weidth = nextsmallerright[i] - nextsmallerleft[i] - 1;
            int area = height * weidth;
            maxarea = Math.max(maxarea, area);
        }
        System.out.println("Maximum recatangle area of histogram is "+maxarea);
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}
