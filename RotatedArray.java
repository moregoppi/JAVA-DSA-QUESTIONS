public class RoateArray {
    public static int searchInRotated(int arr[], int k){
        int low_index=0, higher_index=arr.length-1;
        while(low_index<=higher_index){
            int middle_index=(low_index+higher_index)/2;
            if(k==arr[middle_index]){
                return middle_index;
            }
            //left side is sorted
            if(arr[low_index]<=arr[middle_index]){   
                if(k>=arr[low_index] && k<=arr[middle_index]){  
                    higher_index=middle_index-1;
                }else{
                    low_index=middle_index+1;
                }
            }else{
                if(k>=arr[middle_index]&&k<=arr[higher_index]){
                    low_index=middle_index+1;
                }else{
                    higher_index=middle_index-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(searchInRotated(arr, 0));
    }
}
