public class mergesort { 
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;  // or (si+ei)/2 this is how we calculate middleindex
        mergeSort(arr, si, mid);  //this is for left side array     //these function are dividing the array into half
        mergeSort(arr, mid+1, ei);  //this is for right side array
        mergeThem(arr, mid, si, ei);    //this is the function to merge them

    }
    public static void mergeThem(int arr[],int mid,int si,int ei){
        //ei=arr.length-1  and   si=starting index
        int temp[]=new int[ei-si+1];
        int i=si;   //index for 1st sorted array
        int j=mid+1;  //index for 2nd sorted array
        int k=0;      //index for temp arr
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //copy temp array inoriginal arra
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }
    //to print the functyion array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8,-2};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
