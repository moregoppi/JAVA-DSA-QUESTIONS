//Trapping water
//time complexity is O(n)

public class Q22 {
    public static void trappingWater(int arr[]){
        int n=arr.length;  //length of array stored in it to use it many time
        //calculate left maximum boundary respected to bar
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i], leftmax[i-1]);
        }
        //calculate right maximum boundary respectes to bar
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i], rightmax[i+1]);
        }
        int trappedwater=0;
        int width=1;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel=min(leftmax, rightmax)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trappedwater=(waterlevel-height[i])*width
            trappedwater +=(waterlevel-arr[i])*width;
        }
        System.out.println(trappedwater);
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        trappingWater(arr);
    }
    
    
}
