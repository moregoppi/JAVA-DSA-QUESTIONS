public class quicksort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIndex=partition(arr,si,ei);
        quickSort(arr, si, pIndex-1); //left
        quickSort(arr, pIndex+1, ei);  //right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;  //to make place for element smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                //swap number smaller than pivot
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //this will swap pivot 
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        int ei=arr.length-1;
        quickSort(arr, 0, ei);
        printArray(arr);
    }
}
