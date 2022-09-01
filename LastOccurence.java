public class lastoccurence {
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound==-1&&arr[i]==key){
            return i;
        }
        return isFound;
    }
    //both function are right
    public static int finDkey(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return finDkey(arr,key,i-1);
       
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5,5,5,5};
        System.out.println(lastOccurence(arr, 5, 0));
    }    
}
